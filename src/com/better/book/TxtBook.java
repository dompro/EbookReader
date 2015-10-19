package com.better.book;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 * @author dom<dom_pro@qq.com>
 * @version 创建时间：2015年10月17日 下午8:59:37
 *          txt类型书籍
 */
public class TxtBook extends Book
{

	private InputStreamReader txtInputStreamReader;

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
		BufferedReader reader = new BufferedReader(txtInputStreamReader);
		StringBuffer sb = new StringBuffer("");
		String line;
		try
		{
			while ((line = reader.readLine()) != null)
			{
				sb.append(line);
				sb.append("\n");
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return sb.toString();
		// return null;
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
		// TODO 待完善
		InputStreamReader inputStreamReader = null;
		try
		{
			inputStreamReader = new InputStreamReader(
					new FileInputStream(path), "gbk");
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
			return false;
		}
		catch (UnsupportedEncodingException e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
