package com.tandong.sademo;

import android.net.wifi.WifiInfo;
import android.os.Bundle;

import com.tandong.sa.activity.SmartActivity;
import com.tandong.sa.callback.GlobalCallback;
import com.tandong.sa.system.SystemInfo;

public class SystemInfoActivity extends SmartActivity {
	private SystemInfo systemInfo;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		systemInfo = new SystemInfo(this);

		// ������豸��Root��������Root��Ȩ����������ʾ
		systemInfo.ApplyRootAuthorize();

		// ���wifi�Ƿ���
		boolean isWifiOpen = systemInfo.checkWifi();

		// �ر�wifi
		systemInfo.closeWifi();

		// ����Ƿ��ڷ���ģʽ
		boolean isAirMode = systemInfo.getAirplaneMode(this);

		// ��ȡ�����ڴ棨��λ��M��
		String availableMemory = systemInfo.getAvailableMemory();

		// ��ȡ��ص�����Ϣ(���磺60%)
		systemInfo.getBatteryLevel(new GlobalCallback() {

			@Override
			public void data_result(String arg0) {

			}
		});

		// ��ȡ�豸����������ʱ��
		String bootTime = systemInfo.getBootTime();

		// ��ȡ�豸CPU������
		int cpuCoresNum = systemInfo.getCpuCoresNum();

		// ��ȡCPU���Ƶ�ʣ���λMHZ
		String cpuMaxFrequenc = systemInfo.getCpuMaxFrequence();

		// ��ȡCPU��СƵ�ʣ���λMHZ
		String cpuMinFrequenc = systemInfo.getCpuMinFrequence();

		// ��ȡCPU�ͺ�
		String cpuModel = systemInfo.getCpuModel();

		// ��ȡCPU��ǰ����ʱƵ��
		String currCpuFreq = systemInfo.getCurrCpuFreq();

		// ��ȡ�豸��Ļ�ܶ�(���磺(0.75/1.0/1.5/2.0))
		float deviceDensity = systemInfo.getDeviceDensity();

		// ��ȡ�豸ÿӢ���dpi
		float deviceDensityDpi = systemInfo.getDeviceDensityDpi();

		// ��ȡ�豸��Ļ���ظ߶�
		int deviceHeight = systemInfo.getDeviceHeight();

		// ��ȡ�豸��Ļ���ؿ��
		int deviceWidth = systemInfo.getDeviceWidth();

		// ��ȡ�豸��ǰ����
		String deviceLanguage = systemInfo.getDeviceLanguage();

		// ��ȡ�豸����
		String deviceName = systemInfo.getDeviceName();

		// ��ȡ�豸����0 �� portrait,1 �� landscape��
		int deviceOrientation = systemInfo.getDeviceOrientation();

		// ��ȡ�豸IMEI��
		String imei = systemInfo.getImei();

		// ��ȡ�豸Mac��ַ
		String macAddress = systemInfo.getMacAddress();

		// ��ȡ��������(wifi����Mobile)
		String NetWorkType = systemInfo.getNetWorkType();

		// ��ȡSD�����ô洢�ռ�(��λ��M)
		String sDCardAvailableStorage = systemInfo.getSDCardAvailableStorage();

		// ��ȡSD�������С(��λ��M)
		String sDCardTotalStorage = systemInfo.getSDCardTotalStorage();

		// ����ֻ��ϵĴ��ڵ����д�����
		String sensor = systemInfo.getSensor();

		// ��ȡ�豸ϵͳ�汾��
		String systemVersionCode = systemInfo.getSystemVersionCode();

		// ��ȡ�豸ϵͳ�汾��
		String systemVersionName = systemInfo.getSystemVersionName();

		// ��ȡ�豸�����ڴ�(��λ��M)
		String totalMemory = systemInfo.getTotalMemory();

		// wifi�򿪵�ǰ���£���ȡwifi�����������Ϣ(���ַ��id�����ٵ�)
		WifiInfo wifiInfo = systemInfo.getWifiInfo(true);

		// ��ȡwifi��IP��ַ
		int wifiIpAddress = systemInfo.getWifiIpAddress();

		// ��ȡwifi�������ٶ�
		int wifiLinkSpeed = systemInfo.getWifiLinkSpeed();

		// ��ȡwifi��MAC��ַ
		String wifiMacAddress = systemInfo.getWifiMacAddress();

		// ��ȡwifi��Rssi���ź�ǿ��:0 �� -100��
		int wifiRssi = systemInfo.getWifiRssi();

		// ����Ƿ���GPS����ҪȨ��"android.permission.ACCESS_FINE_LOCATION"
		boolean isOpenGPS = systemInfo.isOpenGPS();

		// ����豸�Ƿ���Root
		boolean isRoot = systemInfo.isRoot();

		// ���豸Wifi
		systemInfo.openWifi();

		// ����ת��wifi���ý���
		systemInfo.openWifiSetting();

		// ȡ����������ģʽ
		systemInfo.setAirplaneModeOn(this, true);

		// ��ȡ�豸��CPU���к�
		String cpuSer = systemInfo.getCpuSer();

		// ��ȡĳ������pid��CPUʹ�����
		int cupUsage = systemInfo.getCpuUsage(2);

	}

}
