package com.tandong.sademo.simulate;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.tandong.sa.activity.SmartActivity;
import com.tandong.sa.core.SmartCore;
import com.tandong.sa.topbar.TopBar;
import com.tandong.sa.topbar.TopBar.Action;
import com.tandong.sademo.R;

public class SimulateClickActivity extends SmartActivity implements OnClickListener {
	private TopBar tb;

	private ImageView iv;
	private TextView tv;
	private Button btn;

	private Handler handler;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_simulateclick);
		initTop();
		initView();

		// �����ģ����TextView
		SmartCore.getMotionEvent(tv, MotionEvent.ACTION_DOWN, 2, 2);
		SmartCore.getMotionEvent(tv, MotionEvent.ACTION_UP, 2, 2);

		handler = new Handler();
		handler.postDelayed(new Runnable() {

			@Override
			public void run() {
				// ��ʱ2��ģ����ImageView
				SmartCore.getMotionEvent(iv, MotionEvent.ACTION_DOWN, 2, 2);
				SmartCore.getMotionEvent(iv, MotionEvent.ACTION_UP, 2, 2);
			}
		}, 2000);

		CountDownTimer cdt = new CountDownTimer(5000, 1000) {

			@Override
			public void onTick(long arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onFinish() {
				// ��ʱ5��ģ����Button
				SmartCore.getMotionEvent(btn, MotionEvent.ACTION_DOWN, 2, 2);
				SmartCore.getMotionEvent(btn, MotionEvent.ACTION_UP, 2, 2);
			}
		};
		cdt.start();

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.iv:
			Toast.makeText(SimulateClickActivity.this, "�ҵ����ͼƬ", 1000).show();
			break;
		case R.id.tv:
			Toast.makeText(SimulateClickActivity.this, "�ҵ��������", 1000).show();
			break;
		case R.id.btn:
			Toast.makeText(SimulateClickActivity.this, "�ҵ���˰�ť", 1000).show();
			break;
		default:
			break;
		}

	}

	private void initView() {
		iv = (ImageView) this.findViewById(R.id.iv);
		tv = (TextView) this.findViewById(R.id.tv);
		btn = (Button) this.findViewById(R.id.btn);
		iv.setOnClickListener(this);
		tv.setOnClickListener(this);
		btn.setOnClickListener(this);

	}

	private void initTop() {
		tb = (TopBar) this.findViewById(R.id.topbar);
		tb.setTitle("ģ����");

		tb.setHomeAction(new Action() {

			@Override
			public void performAction(View view) {
				SimulateClickActivity.this.finish();
			}

			@Override
			public int getDrawable() {

				return R.drawable.back;
			}
		});

	}
}
