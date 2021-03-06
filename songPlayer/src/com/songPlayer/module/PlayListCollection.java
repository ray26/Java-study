package com.songPlayer.module;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PlayListCollection {
	Map<String, PlayList> playListMap;

	public PlayListCollection() {

	}

	public PlayListCollection(Map<String, PlayList> playlistcollection) {
		this.playListMap = playlistcollection;
	}

	public Map<String, PlayList> getPlayListMap() {
		return playListMap;
	}

	public void setPlayListMap(Map<String, PlayList> playListMap) {
		this.playListMap = playListMap;
	}

	/**
	 * 添加播放列表
	 */
	public void addPlayList(PlayList playList) {
		playListMap.put(playList.getPlayListName(), playList);
	}

	/**
	 * 删除播放列表
	 */
	public void deletePlayList(PlayList playList) {
		if (playListMap.containsKey(playList.getPlayListName()) == true) {
			playListMap.remove(playList.getPlayListName());
		} else {
			System.out.println("未找到播放列表");
		}
	}

	/**
	 * 通过名字查询
	 */
	public PlayList searchPlayListByName(String playListName) {
		PlayList tem = null;
		Set<Entry<String, PlayList>> set = playListMap.entrySet();
		for (Entry<String, PlayList> entry : set) {
			if (entry.getKey().equals(playListName)) {
				tem = entry.getValue();
				break;
			}
		}
		return tem;

	}

	/**
	 * 显示所有播放列表名称
	 */
	public void displayPlayListName() {
		Set<String> playListNameAll = playListMap.keySet();
		Iterator<String> it = playListNameAll.iterator();
		if (playListNameAll.isEmpty()) {
			System.out.println("无播放列表");
		} else {
			while (it.hasNext()) {
				System.out.println(it.next());
			}
		}
	}
}
