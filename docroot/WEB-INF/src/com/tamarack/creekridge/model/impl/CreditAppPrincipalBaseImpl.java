/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package com.tamarack.creekridge.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.tamarack.creekridge.model.CreditAppPrincipal;
import com.tamarack.creekridge.service.CreditAppPrincipalLocalServiceUtil;

/**
 * The extended model base implementation for the CreditAppPrincipal service. Represents a row in the &quot;eCreekRidge_CreditAppPrincipal&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CreditAppPrincipalImpl}.
 * </p>
 *
 * @author pmacha
 * @see CreditAppPrincipalImpl
 * @see com.tamarack.creekridge.model.CreditAppPrincipal
 * @generated
 */
public abstract class CreditAppPrincipalBaseImpl
	extends CreditAppPrincipalModelImpl implements CreditAppPrincipal {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a credit app principal model instance should use the {@link CreditAppPrincipal} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CreditAppPrincipalLocalServiceUtil.addCreditAppPrincipal(this);
		}
		else {
			CreditAppPrincipalLocalServiceUtil.updateCreditAppPrincipal(this);
		}
	}
}