package com.tandong.sademo;

import android.os.Bundle;

import com.tandong.sa.activity.SmartFragmentActivity;

public class MainFragmentActivity extends SmartFragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// ��ת��Ŀ��MainActivity���رյ�ǰActivity
		gotoActivity(MainActivity.class, true);

		// ��ת��Ŀ��MainActivity,���رյ�ǰActivity�����ݹ�ȥBundle��Ϣ��
		gotoActivity(MainActivity.class, false, savedInstanceState);

		// ������������SmartActivity
	}

}
