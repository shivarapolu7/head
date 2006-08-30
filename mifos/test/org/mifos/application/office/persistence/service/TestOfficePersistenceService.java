package org.mifos.application.office.persistence.service;

import java.util.List;

import org.mifos.framework.MifosTestCase;

import org.mifos.application.office.business.OfficeView;
import org.mifos.application.office.persistence.OfficePersistence;
import org.mifos.framework.business.service.ServiceFactory;
import org.mifos.framework.exceptions.PersistenceException;
import org.mifos.framework.hibernate.helper.HibernateUtil;
import org.mifos.framework.security.authorization.HierarchyManager;
import org.mifos.framework.util.helpers.PersistenceServiceName;

public class TestOfficePersistenceService extends MifosTestCase {
	OfficePersistenceService dbService;

	public void setUp() throws Exception {
		dbService=((OfficePersistenceService) ServiceFactory.getInstance().getPersistenceService(PersistenceServiceName.Office));
		HierarchyManager.getInstance().init();
	}
	public void tearDown() {
		HibernateUtil.closeSession();

	}
	
	public void  testGetActiveBranchesForHO(){
		OfficePersistence officePersistence = new OfficePersistence();
		List <OfficeView> officeList = officePersistence.getActiveOffices(Short.valueOf("1"));
		
		assertEquals(1 ,officeList.size()) ;
	}
	
	public void  testGetActiveBranchs(){
		OfficePersistence officePersistence = new OfficePersistence();
		List <OfficeView> officeList = officePersistence.getActiveOffices(Short.valueOf("3"));
		
		assertEquals(1 ,officeList.size()) ;
	}
	
	public void testGetAllOffices()throws Exception{
		assertEquals(Integer.valueOf("3").intValue(),dbService.getAllOffices().size());
	}
	public void testGetMaxOfficeId(){
		assertEquals(3,dbService.getMaxOfficeId().intValue());
	}
	public void testGetChildCount(){
		
		assertEquals(1,dbService.getChildCount(Short.valueOf("1")).intValue());
	}

}
