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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.tamarack.creekridge.model.Product;
import com.tamarack.creekridge.model.ProductModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Product service. Represents a row in the &quot;eCreekRidge_Product&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.tamarack.creekridge.model.ProductModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ProductImpl}.
 * </p>
 *
 * @author pmacha
 * @see ProductImpl
 * @see com.tamarack.creekridge.model.Product
 * @see com.tamarack.creekridge.model.ProductModel
 * @generated
 */
public class ProductModelImpl extends BaseModelImpl<Product>
	implements ProductModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a product model instance should use the {@link com.tamarack.creekridge.model.Product} interface instead.
	 */
	public static final String TABLE_NAME = "eCreekRidge_Product";
	public static final Object[][] TABLE_COLUMNS = {
			{ "productId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "productName", Types.VARCHAR },
			{ "sequenceNumber", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table eCreekRidge_Product (productId LONG not null primary key,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,productName VARCHAR(75) null,sequenceNumber LONG)";
	public static final String TABLE_SQL_DROP = "drop table eCreekRidge_Product";
	public static final String ORDER_BY_JPQL = " ORDER BY product.sequenceNumber ASC, product.productName ASC";
	public static final String ORDER_BY_SQL = " ORDER BY eCreekRidge_Product.sequenceNumber ASC, eCreekRidge_Product.productName ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.tamarack.creekridge.model.Product"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.tamarack.creekridge.model.Product"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.tamarack.creekridge.model.Product"),
			true);
	public static long PRODUCTID_COLUMN_BITMASK = 1L;
	public static long SEQUENCENUMBER_COLUMN_BITMASK = 2L;
	public static long PRODUCTNAME_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.tamarack.creekridge.model.Product"));

	public ProductModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _productId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setProductId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _productId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Product.class;
	}

	@Override
	public String getModelClassName() {
		return Product.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("productId", getProductId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("productName", getProductName());
		attributes.put("sequenceNumber", getSequenceNumber());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long productId = (Long)attributes.get("productId");

		if (productId != null) {
			setProductId(productId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String productName = (String)attributes.get("productName");

		if (productName != null) {
			setProductName(productName);
		}

		Long sequenceNumber = (Long)attributes.get("sequenceNumber");

		if (sequenceNumber != null) {
			setSequenceNumber(sequenceNumber);
		}
	}

	@Override
	public long getProductId() {
		return _productId;
	}

	@Override
	public void setProductId(long productId) {
		_columnBitmask |= PRODUCTID_COLUMN_BITMASK;

		if (!_setOriginalProductId) {
			_setOriginalProductId = true;

			_originalProductId = _productId;
		}

		_productId = productId;
	}

	public long getOriginalProductId() {
		return _originalProductId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@Override
	public String getProductName() {
		if (_productName == null) {
			return StringPool.BLANK;
		}
		else {
			return _productName;
		}
	}

	@Override
	public void setProductName(String productName) {
		_columnBitmask = -1L;

		_productName = productName;
	}

	@Override
	public long getSequenceNumber() {
		return _sequenceNumber;
	}

	@Override
	public void setSequenceNumber(long sequenceNumber) {
		_columnBitmask = -1L;

		_sequenceNumber = sequenceNumber;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Product.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Product toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Product)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ProductImpl productImpl = new ProductImpl();

		productImpl.setProductId(getProductId());
		productImpl.setCompanyId(getCompanyId());
		productImpl.setUserId(getUserId());
		productImpl.setUserName(getUserName());
		productImpl.setCreateDate(getCreateDate());
		productImpl.setModifiedDate(getModifiedDate());
		productImpl.setProductName(getProductName());
		productImpl.setSequenceNumber(getSequenceNumber());

		productImpl.resetOriginalValues();

		return productImpl;
	}

	@Override
	public int compareTo(Product product) {
		int value = 0;

		if (getSequenceNumber() < product.getSequenceNumber()) {
			value = -1;
		}
		else if (getSequenceNumber() > product.getSequenceNumber()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		value = getProductName().compareTo(product.getProductName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Product)) {
			return false;
		}

		Product product = (Product)obj;

		long primaryKey = product.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		ProductModelImpl productModelImpl = this;

		productModelImpl._originalProductId = productModelImpl._productId;

		productModelImpl._setOriginalProductId = false;

		productModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Product> toCacheModel() {
		ProductCacheModel productCacheModel = new ProductCacheModel();

		productCacheModel.productId = getProductId();

		productCacheModel.companyId = getCompanyId();

		productCacheModel.userId = getUserId();

		productCacheModel.userName = getUserName();

		String userName = productCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			productCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			productCacheModel.createDate = createDate.getTime();
		}
		else {
			productCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			productCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			productCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		productCacheModel.productName = getProductName();

		String productName = productCacheModel.productName;

		if ((productName != null) && (productName.length() == 0)) {
			productCacheModel.productName = null;
		}

		productCacheModel.sequenceNumber = getSequenceNumber();

		return productCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{productId=");
		sb.append(getProductId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", productName=");
		sb.append(getProductName());
		sb.append(", sequenceNumber=");
		sb.append(getSequenceNumber());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.tamarack.creekridge.model.Product");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>productId</column-name><column-value><![CDATA[");
		sb.append(getProductId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>productName</column-name><column-value><![CDATA[");
		sb.append(getProductName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sequenceNumber</column-name><column-value><![CDATA[");
		sb.append(getSequenceNumber());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Product.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Product.class
		};
	private long _productId;
	private long _originalProductId;
	private boolean _setOriginalProductId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _productName;
	private long _sequenceNumber;
	private long _columnBitmask;
	private Product _escapedModel;
}