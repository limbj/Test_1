package member.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

import jdbc.JdbcUtil;
import jdbc.connection.ConnectionProvider;
import member.dao.MemberDao;
import member.model.Member;

public class JoinService {

	private MemberDao memberDao = new MemberDao();

	public void join(JoinRequest joinReq) {
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();
			// transaction 처리
			conn.setAutoCommit(false);

			// 요청에 대한 처리 1(ID 중복 검사)
			Member member = memberDao.selectById(conn, joinReq.getId());
			if (member != null) {
				JdbcUtil.rollback(conn);
				throw new DuplicateIdException();
			}

			// 요청에 대한 처리 2
			memberDao.insert(conn, new Member(joinReq.getId(), joinReq.getName(), joinReq.getPassword(), new Date()));
			conn.commit();
		} catch (SQLException e) {
			JdbcUtil.rollback(conn);
			throw new RuntimeException(e);
		} finally {
			JdbcUtil.close(conn);
		}
	}
}
