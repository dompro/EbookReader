package com.better.book;

/**
 * @author dom<dom_pro@qq.com>
 * @version 创建时间：2015年10月17日 下午8:59:37
 *          书籍基类，便于后期扩展
 */
abstract class Book
{
	double process = 0.0;
	int allPages = 0;
	int currentPage = 0;
	int pageSize = 0;

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

	public abstract boolean openBook(String path);

	public abstract boolean openBigBook(String path);

	public abstract boolean openHugeBook(String path);

	abstract StringBuilder getPageContent(int page);

	StringBuilder getCurrentPageContent()
	{
		return getPageContent(currentPage);
	}

	public StringBuilder prePage()
	{
		if (currentPage <= 1)
			return null;
		currentPage--;
		return getCurrentPageContent();
	}

	public StringBuilder nextPage()
	{
		if (currentPage >= allPages)
			return null;
		currentPage++;
		return getCurrentPageContent();
	}

}
