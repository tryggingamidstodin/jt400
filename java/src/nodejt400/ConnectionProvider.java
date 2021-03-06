package nodejt400;

import java.sql.Connection;

public interface ConnectionProvider
{
	Connection getConnection() throws Exception;

	void close(Connection c) throws Exception;
}
