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
		// ServletContext�ṩgetResourceAsStream()����
		// ����ָ���ļ���Ӧ��������
		return ServletActionContext.getServletContext()
			.getResourceAsStream(inputPath);
	}

	public String execute() throws Exception
	{
	return SUCCESS;
	
	}
}
