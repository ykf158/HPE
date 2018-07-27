package com.hpe.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.hpe.po.Telephone;

public class TeleService {

	List<Telephone> tels = new ArrayList<>();

	public void init(String path) {
		// 读取记事本中的数据（一行转换为
		// 一个Telephone对象，将这个对象放到tels，执行一次(启动时)）
		BufferedReader br = null;
		try {
			File file = new File(path);
			if(!file.exists()) {
				file.createNewFile();
			}
			br = new BufferedReader(new FileReader(file));
			String line;
			while ((line = br.readLine()) != null) {
				String[] info = line.split(",");
				Telephone telephone = new Telephone();
				telephone.setName(info[0]);
				telephone.setSex(info[1].charAt(0));
				telephone.setAge(Integer.parseInt(info[2]));
				telephone.setNumber(info[3]);
				telephone.setQq(info[4]);
				telephone.setAddress(info[5]);
				
				//将telephone对象添加到tels中
				tels.add(telephone);			
			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}finally {
			if (br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	/**
	 * @title 添加电话本业务
	 * @author 尤锴丰
	 * @date 2018年7月27日上午11:13:34
	 * @param telephone
	 * @return int
	 */
	public int addTel(Telephone telephone) {
		int index = selectIndexByName(telephone.getName());
		if (index != -1) {
			return -1;
		}

		return tels.add(telephone) ? 1 : 0;

	}

	/**
	 * @title 删除电话本业务
	 * @author 尤锴丰
	 * @date 2018年7月27日上午11:10:58
	 * @param name
	 * @return boolean
	 */
	public boolean deteleTelByName(String name) {

		int index = selectIndexByName(name);
		if (index == -1) {
			return false;
		}

		// 删除
		tels.remove(index);
		return true;
	}

	/**
	 * @title 根据姓名修改电话本业务
	 * @author 尤锴丰
	 * @date 2018年7月27日上午11:39:38
	 * @param oldName
	 * @param newTel
	 * @return boolean
	 */
	public boolean updateTelByName(String oldName, Telephone newTel) {
		// 得到索引
		int oldIndex = selectIndexByName(oldName);
		// 判断是否重名
		Telephone newName = selectTelByName(newTel.getName());
		if (newName == null) {
			tels.set(oldIndex, newTel);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @title 查询所有电话本业务
	 * @author 尤锴丰
	 * @date 2018年7月27日上午11:14:13
	 * @return List<Telephone>
	 */
	public List<Telephone> selectAllTel() {
		return tels;
	}

	/**
	 * @title 根据名字查询电话本的业务
	 * @author 尤锴丰
	 * @date 2018年7月27日上午11:14:35
	 * @param name
	 * @return Telephone
	 */
	public Telephone selectTelByName(String name) {
		// 得到此名字电话本的索引
		int telIndex = selectIndexByName(name);
		// 返回电话本
		if (telIndex != -1) {
			return tels.get(telIndex);
		} else {
			return null;
		}

	}

	/**
	 * @title 返回name在集合中的索引
	 * @author 尤锴丰
	 * @date 2018年7月27日上午11:15:07
	 * @param name
	 * @return int
	 */
	public int selectIndexByName(String name) {
		for (int i = 0; i < tels.size(); i++) {
			Telephone tel = tels.get(i);
			String name1 = tel.getName();
			if (name.equals(name1)) {
				return i;
			}
		}
		return -1;
	}

	
	/**
	 * @title 退出应用时，将tels中的数据写到path这个文件中，属性以英文“,”隔开 
	 * @author 尤锴丰
	 * @date 2018年7月27日下午2:39:35
	 * @param path
	 */
	public void save(String path) {
		
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(path));
			for (Telephone tel : tels) {
				bw.write(tel.message());
				bw.newLine();
				bw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(bw!=null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
