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
		super();
	}

	public TxtBook(double process, int currentPage, int pageSize)
	{
		super(process, currentPage, pageSize);
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

	@Override
	public boolean openNormalBook(String path)
	{
		// TODO 自动生成的方法存根
		return false;
	}

}
