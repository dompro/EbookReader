package com.better.er;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.Window;
import android.widget.TextView;

import com.better.book.Book;
import com.better.book.TxtBook;
import com.better.er.g.GlobalParamter;

/**
 * @author dom<dom_pro@qq.com>
 * @version 创建时间：2015年10月17日 下午8:59:37
 *          书籍阅读界面
 */
public class ReadActivity extends Activity
{
	/* 书籍路径 */
	private String bookPath;
	/* 书籍名称 */
	private String bookName;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		// 无标题
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_read);

		// 初始化界面元素
		initView();
	}

	/**
	 * 初始化界面元素
	 */
	private void initView()
	{
		// 获取阅读书籍的路径和名称
		bookPath = getIntent().getStringExtra(GlobalParamter.KEY_BOOK_PATH);
		bookPath = Environment.getExternalStorageDirectory().getAbsolutePath()
				+ "/book.txt";
		bookName = getIntent().getStringExtra(GlobalParamter.KEY_BOOK_NAME);
		Book book = new TxtBook(0, 2, 10);
		if (book.openBook(bookPath))
		{
			// 显示信息
			((TextView) findViewById(R.id.textView1)).setText(book
					.getCurrentPageContent());
		}
	}
}
