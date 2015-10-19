package com.better.book;

/**
 * @author dom<dom_pro@qq.com>
 * @version 创建时间：2015年10月17日 下午8:59:37
 *          txt类型书籍
 */
public class TxtBook extends Book
{

	public TxtBook()
	{

	}

	public TxtBook(double process, int currentPage, int pageSize)
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

	@Override
	public boolean openBook(String path)
	{
		// TODO 待完善
		return false;
	}

	@Override
	StringBuilder getPageContent(int page)
	{
		// TODO 待完善
		return null;
	}

	@Override
	public boolean openBigBook(String path)
	{
		// TODO 待完善
		return false;
	}

	@Override
	public boolean openHugeBook(String path)
	{
		// TODO 待完善
		return false;
	}

}
