package com.better.er;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.better.er.g.GlobalParamter;

/**
 * @author dom<dom_pro@qq.com>
 * @version 创建时间：2015年10月17日 下午8:59:37
 *          显示书籍，提供阅读入口
 */
public class MainActivity extends Activity
{
	/* Log Tag */
	private static final String TAG = "MainActivity";
	/* 测试书籍路径 */
	private static final String TEST_BOOK_PATH = "/sdcard/book.txt";
	/* 测试书籍名称 */
	private static final String TEST_BOOK_NAME = "很纯很暧昧";

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// 初始化界面元素
		initView();
	}

	/**
	 * 初始化界面元素
	 */
	private void initView()
	{
		// Button事件
		findViewById(R.id.button1).setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v)
			{
				// 进入书籍的阅读界面
				Intent intent = new Intent(MainActivity.this,
						ReadActivity.class);
				// 书籍路径
				intent.putExtra(GlobalParamter.KEY_BOOK_PATH, TEST_BOOK_PATH);
				// 书籍名称
				intent.putExtra(GlobalParamter.KEY_BOOK_NAME, TEST_BOOK_NAME);
				startActivity(intent);
			}
		});

	}
}
