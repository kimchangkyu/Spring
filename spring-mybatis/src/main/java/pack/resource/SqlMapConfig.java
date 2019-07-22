package pack.resource;

import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlMapConfig {
      public static SqlSessionFactory sqlSession; // SqlSessionFactory : DataMapper.xml의 id를 읽는 놈 -> 여기에 sql문이 있다.

      static {
            String resource = "pack/resource/Configuration.xml";
            try {
                  Reader reader = Resources.getResourceAsReader(resource);
                  sqlSession = new SqlSessionFactoryBuilder().build(reader);
                  reader.close();
            } catch (Exception e) {
                  System.out.println("SqlMapConfig 오류 : " + e);
            }
      }
      
      public static SqlSessionFactory getSqlSession() {
            return sqlSession;
      }
}
