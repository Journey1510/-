package TeacherAction;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class UploadTestpaper extends ActionSupport{
	private String title;
	private File upload;
	private String uploadContentType;
	private String uploadFileName;
	private String savePath;
	public String getTitle() {
		return (this.title);
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public File getUpload() {
		return (this.upload);
	}
	public void setUpload(File upload) {
		this.upload = upload;
	}
	public String getUploadContentType() {
		return (this.uploadContentType);
	}
	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}
	public String getUploadFileName() {
		return (this.uploadFileName);
	}
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	public String getSavePath() throws Exception{
		return ServletActionContext.getServletContext()
				.getRealPath(savePath);
	}
	public void setSavePath(String value) {
		this.savePath = value;
	}
	@Override
	public String execute() throws Exception
	{
		//以服务器的文件保存地址和原文件名建立上传文件输出流
		FileOutputStream fos = new FileOutputStream(getSavePath()
			+ "\\" + getUploadFileName());
		FileInputStream fis = new FileInputStream(getUpload());
		byte[] buffer = new byte[1024];
		int len = 0;
		while ((len = fis.read(buffer)) > 0)
		{
			fos.write(buffer , 0 , len);
		}
		fos.close();
		return SUCCESS;
	}
}
