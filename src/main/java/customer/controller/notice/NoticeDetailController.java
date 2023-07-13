package customer.controller.notice;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import customer.controller.Controller;
import customer.dao.NoticeDao;
import customer.vo.Notice;

public class NoticeDetailController implements Controller{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		System.out.println("NoticeDetailController~~~~~");
		
		
		
//		request.getRequestDispatcher("notice.jsp").forward(request, response);		
		
	}
}
