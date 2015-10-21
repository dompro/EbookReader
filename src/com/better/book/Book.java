package com.better.book;

import com.better.util.FileSizeUtil;

/**
 * @author dom<dom_pro@qq.com>
 * @version 创建时间：2015年10月17日 下午8:59:37
 *          书籍基类，便于后期扩展
 */
public abstract class Book
{
	/* 书籍阅读进度 */
	double process = 0.0;
	/* 书籍总页数 */
	int allPages = 0;
	/* 当前阅读页 */
	int currentPage = 0;
	/* 每页显示的字符数 */
	int pageSize = 0;

	int bookSizeType = BOOK_SIZE_NORMAL;
	static int BOOK_SIZE_NORMAL = 0;
	static int BOOK_SIZE_BIG = 1;
	static int BOOK_SIZE_HUGE = 2;

	public Book()
	{

	}

	public Book(double process, int currentPage, int pageSize)
	{
		this.process = process;
		this.currentPage = currentPage;
		this.pageSize = pageSize;
	}

	public double getProcess()
	{
		return process;
	}

	public void setProcess(double process)
	{
		this.process = process;
	}

	public int getCurrentPage()
	{
		return currentPage;
	}

	public void setCurrentPage(int currentPage)
	{
		this.currentPage = currentPage;
	}

	public int getPageSize()
	{
		return pageSize;
	}

	public void setPageSize(int pageSize)
	{
		this.pageSize = pageSize;
	}

	public boolean openBook(String path)
	{
		double bookSize = FileSizeUtil.getFileOrFilesSize(path,
				FileSizeUtil.SIZETYPE_MB);
		if (bookSize < 10.0)
		{
			bookSizeType = BOOK_SIZE_NORMAL;
			return openNormalBook(path);
		}
		else if (bookSize < 500)
		{
			bookSizeType = BOOK_SIZE_BIG;
			return openBigBook(path);
		}
		else
		{
			bookSizeType = BOOK_SIZE_HUGE;
			return openHugeBook(path);
		}
	}

	public abstract boolean openNormalBook(String path);

	public abstract boolean openBigBook(String path);

	public abstract boolean openHugeBook(String path);

	abstract String getPageContent(int page);

	public String getCurrentPageContent()
	{
		return getPageContent(currentPage);
	}

	public String prePage()
	{
		if (currentPage <= 1)
			return null;
		currentPage--;
		return getCurrentPageContent();
	}

	public String nextPage()
	{
		if (currentPage >= allPages)
			return null;
		currentPage++;
		return getCurrentPageContent();
	}

}
