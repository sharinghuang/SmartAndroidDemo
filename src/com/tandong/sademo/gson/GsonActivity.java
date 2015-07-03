package com.tandong.sademo.gson;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.util.Log;

import com.tandong.sa.activity.SmartActivity;
import com.tandong.sa.json.Gson;
import com.tandong.sa.json.reflect.TypeToken;
import com.tandong.sademo.entity.MyEntity;

public class GsonActivity extends SmartActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		analyzeJson();

	}

	String gson_str = "{\"status\": 0,\"name\":\"SmartAndroid Gson \"}";

	String gson_list = "[{\"status\": 0,\"name\":\"SmartAndroid Gson \"},{\"status\": 2,\"name\":\"SmartAndroid Gson2 \"}]";

	private void analyzeJson() {

		// 1.��JSON��һ����תΪJava��ʵ�������
		Gson gson = new Gson();
		MyEntity myEntity = gson.fromJson(gson_str, MyEntity.class);// ����������json����ҪתΪ��ʵ�������
		Log.i("info", myEntity.getStatus() + "��" + myEntity.getName());

		// 2.��JSON����תΪʵ���б�
		List<MyEntity> me = gson.fromJson(gson_list, new TypeToken<List<MyEntity>>() {
		}.getType());
		for (int i = 0; i < me.size(); i++) {
			MyEntity p = me.get(i);

		}

		// 3.��һ������ʵ��תΪJson��ʽString

		MyEntity entity = new MyEntity();
		entity.setName("SA");
		entity.setStatus(3);
		String jsonStr = gson.toJson(entity);

		// 4.�����󼯺��б�תΪJsonArray���͵�����
		List<MyEntity> meBeans = new ArrayList<MyEntity>();
		MyEntity meBean = new MyEntity();
		meBean.setName("SA1");
		meBean.setStatus(4);

		meBeans.add(meBean);
		meBeans.add(meBean);// ����2�Σ�����������������2��ʵ����,�������

		Type type = new TypeToken<List<MyEntity>>() {
		}.getType(); // ָ�����϶�������
		String beanListToJson = gson.toJson(meBeans, type);
		
		//ͬ��Hashmap������Ҳ�ǿ���תΪJSON��ʽ�ģ��Լ����Բ�����
	}
}
