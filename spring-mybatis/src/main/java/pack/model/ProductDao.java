package pack.model;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import pack.resource.SqlMapConfig;

public class ProductDao implements DaoInter{
      private SqlSessionFactory factory = SqlMapConfig.getSqlSession();
      
      // DaoInter의 selectDataAll을 오버라이딩
      public List<ProductDto> selectDataAll() {
            SqlSession session = factory.openSession();
            List<ProductDto> list = null; // list를 준비

            try {
                  list = session.selectList("selectDataAll"); // 여러개를 가져올 때 selectList // 하나만 가져올 때는 selectOne 
            } catch (Exception e) {
                  System.out.println("selectDataAll err : " + e);
            } finally{
                  if(session != null) session.close();
            }
            return list;
      }
}
