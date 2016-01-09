package Action;

import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.*;

import java.util.Map;
import java.io.InputStream;

public class FileDownloadAction
	implements Action
{
	private String inputPath;
	public void setInputPath(String value)
	{
		inputPath = value;
	}

	public InputStream getTargetFile() throws Exception
	{
		// ServletContext提供getResourceAsStream()方法
		// 返回指定文件对应的输入流
		return ServletActionContext.getServletContext()
			.getResourceAsStream(inputPath);
	}

	public String execute() throws Exception
	{
	return SUCCESS;
	
	}
}
