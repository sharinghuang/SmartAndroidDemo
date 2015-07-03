package com.tandong.sademo.reflect;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.tandong.sa.activity.SmartActivity;
import com.tandong.sa.core.SmartCore;
import com.tandong.sa.topbar.TopBar;
import com.tandong.sa.topbar.TopBar.Action;
import com.tandong.sademo.R;

public class ReflectActivity extends SmartActivity {
	private TopBar tb;

	private ImageView iv;
	private TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(SmartCore.smartResourceId(this, "activity_reflect", "layout"));

		iv = (ImageView) this.findViewById(SmartCore.smartResourceId(this, "iv", "id"));
		tv = (TextView) this.findViewById(SmartCore.smartResourceId(this, "tv", "id"));

		iv.setImageResource(SmartCore.smartResourceId(this, "ic_launcher", "drawable"));
		tv.setText(SmartCore.smartResourceId(this, "reflect", "string"));

		tv.setTextColor(SmartCore.smartResourceId(this, "gold", "color"));

		// ��Ȼ���������鷳���������ṩ����һ�ֻ��ƺ�˼�룬һЩ���ĵط��ǻ��õ����SmartCore���䷽����

		initTop();
	}

	private void initTop() {
		tb = (TopBar) this.findViewById(R.id.topbar);
		tb.setTitle("������");
		tb.setHomeAction(new Action() {

			@Override
			public void performAction(View view) {
				ReflectActivity.this.finish();
			}

			@Override
			public int getDrawable() {

				return R.drawable.back;
			}
		});

	}
}
