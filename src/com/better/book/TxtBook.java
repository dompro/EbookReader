package com.better.book;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author dom<dom_pro@qq.com>
 * @version 创建时间：2015年10月17日 下午8:59:37
 *          txt类型书籍
 */
public class TxtBook extends Book
{
	private RandomAccessFile normalAccessFile;

	public TxtBook()
	{
		super();
	}

	public TxtBook(double process, int currentPage, int pageSize)
	{
		super(process, currentPage, pageSize);
	}

	@Override
	String getPageContent(int page)
	{
		// TODO 待完善
		byte[] bytes = new byte[pageSize * 2];
		try
		{
			normalAccessFile.seek((page - 1) * pageSize * 2);
			normalAccessFile.read(bytes, 0, pageSize * 2);
		}
		catch (IOException e)
		{
			e.printStackTrace();
			return null;
		}

		return new String(bytes);
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

	@SuppressWarnings("resource")
	@Override
	public boolean openNormalBook(String path)
	{
		try
		{
			normalAccessFile = new RandomAccessFile(path, "r");
			allPages = 10;
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
