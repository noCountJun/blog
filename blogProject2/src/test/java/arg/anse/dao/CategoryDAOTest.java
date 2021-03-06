package arg.anse.dao;

import org.anse.dao.CategoryDAO;
import org.anse.vo.CategoryVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( locations= {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class CategoryDAOTest {
	
	@Autowired
	private CategoryDAO dao;
	
	@Test
	public void insertCategoryTest() throws Exception {
		CategoryVO categoryVo = new CategoryVO();
		
		categoryVo.setCtgNm("������");
		categoryVo.setCtgDepth("2");
		categoryVo.setUpCtgId("29");	// 29
		categoryVo.setDispYn("Y");
		categoryVo.setSortNo(99);
		
		dao.insertCategory(categoryVo);
		
		
	}

}
