package com.iyuexian.wechat4j.model;

import com.blade.kit.DateKit;
import com.blade.kit.json.JSONObject;
import com.iyuexian.wechat4j.config.Config;
import com.iyuexian.wechat4j.util.PropertyReader;

public class WechatMeta {

	protected String base_uri, redirect_uri, webpush_url = Config.BASE_URL;
	protected String uuid;
	protected String skey;
	protected String synckey;
	protected String wxsid;
	protected String wxuin;
	protected String pass_ticket;
	protected boolean alive;
	protected String deviceId = "e" + DateKit.getCurrentUnixTime();

	protected String cookie;

	protected JSONObject baseRequest;
	protected JSONObject SyncKey;
	protected JSONObject User;

	protected PropertyReader config;
	public WechatMeta(String configLocation) {
		config = PropertyReader.load(configLocation);
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getSkey() {
		return skey;
	}

	public void setSkey(String skey) {
		this.skey = skey;
	}

	public String getSynckey() {
		return synckey;
	}

	public void setSynckey(String synckey) {
		this.synckey = synckey;
	}

	public String getWxsid() {
		return wxsid;
	}

	public void setWxsid(String wxsid) {
		this.wxsid = wxsid;
	}

	public String getWxuin() {
		return wxuin;
	}

	public void setWxuin(String wxuin) {
		this.wxuin = wxuin;
	}

	public String getPass_ticket() {
		return pass_ticket;
	}

	public void setPass_ticket(String pass_ticket) {
		this.pass_ticket = pass_ticket;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getCookie() {
		return cookie;
	}

	public void setCookie(String cookie) {
		this.cookie = cookie;
	}

	public JSONObject getBaseRequest() {
		return baseRequest;
	}

	public void setBaseRequest(JSONObject baseRequest) {
		this.baseRequest = baseRequest;
	}

	public JSONObject getSyncKey() {
		return SyncKey;
	}

	public void setSyncKey(JSONObject syncKey) {
		SyncKey = syncKey;
	}

	public JSONObject getUser() {
		return User;
	}

	public void setUser(JSONObject user) {
		User = user;
	}

	public String getBase_uri() {
		return base_uri;
	}

	public void setBase_uri(String base_uri) {
		this.base_uri = base_uri;
	}

	public String getRedirect_uri() {
		return redirect_uri;
	}

	public void setRedirect_uri(String redirect_uri) {
		this.redirect_uri = redirect_uri;
	}

	public String getWebpush_url() {
		return webpush_url;
	}

	public void setWebpush_url(String webpush_url) {
		this.webpush_url = webpush_url;
	}

	public PropertyReader getConfig() {
		return config;
	}


}
