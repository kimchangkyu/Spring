package controller;

import model.DataDao;

public class SelectServiceImpl implements SelectService {
	private DataDao dataDao; // 포함관계
	
	public SelectServiceImpl(DataDao dataDao) {
		System.out.println("SelectServiceImpl 생성자");
		this.dataDao = dataDao;
	}
	
	@Override
	public void selectProcess() {
		System.out.println("selectProcess 수행");
		dataDao.selectData();
	}

}
