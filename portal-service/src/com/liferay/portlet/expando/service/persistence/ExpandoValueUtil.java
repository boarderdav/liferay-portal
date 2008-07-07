/**
 * Copyright (c) 2000-2008 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.portlet.expando.service.persistence;

/**
 * <a href="ExpandoValueUtil.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 *
 */
public class ExpandoValueUtil {
	public static com.liferay.portlet.expando.model.ExpandoValue create(
		long valueId) {
		return getPersistence().create(valueId);
	}

	public static com.liferay.portlet.expando.model.ExpandoValue remove(
		long valueId)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.expando.NoSuchValueException {
		return getPersistence().remove(valueId);
	}

	public static com.liferay.portlet.expando.model.ExpandoValue remove(
		com.liferay.portlet.expando.model.ExpandoValue expandoValue)
		throws com.liferay.portal.SystemException {
		return getPersistence().remove(expandoValue);
	}

	/**
	 * @deprecated Use <code>update(ExpandoValue expandoValue, boolean merge)</code>.
	 */
	public static com.liferay.portlet.expando.model.ExpandoValue update(
		com.liferay.portlet.expando.model.ExpandoValue expandoValue)
		throws com.liferay.portal.SystemException {
		return getPersistence().update(expandoValue);
	}

	/**
	 * Add, update, or merge, the entity. This method also calls the model
	 * listeners to trigger the proper events associated with adding, deleting,
	 * or updating an entity.
	 *
	 * @param        expandoValue the entity to add, update, or merge
	 * @param        merge boolean value for whether to merge the entity. The
	 *                default value is false. Setting merge to true is more
	 *                expensive and should only be true when expandoValue is
	 *                transient. See LEP-5473 for a detailed discussion of this
	 *                method.
	 * @return        true if the portlet can be displayed via Ajax
	 */
	public static com.liferay.portlet.expando.model.ExpandoValue update(
		com.liferay.portlet.expando.model.ExpandoValue expandoValue,
		boolean merge) throws com.liferay.portal.SystemException {
		return getPersistence().update(expandoValue, merge);
	}

	public static com.liferay.portlet.expando.model.ExpandoValue updateImpl(
		com.liferay.portlet.expando.model.ExpandoValue expandoValue,
		boolean merge) throws com.liferay.portal.SystemException {
		return getPersistence().updateImpl(expandoValue, merge);
	}

	public static com.liferay.portlet.expando.model.ExpandoValue findByPrimaryKey(
		long valueId)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.expando.NoSuchValueException {
		return getPersistence().findByPrimaryKey(valueId);
	}

	public static com.liferay.portlet.expando.model.ExpandoValue fetchByPrimaryKey(
		long valueId) throws com.liferay.portal.SystemException {
		return getPersistence().fetchByPrimaryKey(valueId);
	}

	public static java.util.List<com.liferay.portlet.expando.model.ExpandoValue> findByTableId(
		long tableId) throws com.liferay.portal.SystemException {
		return getPersistence().findByTableId(tableId);
	}

	public static java.util.List<com.liferay.portlet.expando.model.ExpandoValue> findByTableId(
		long tableId, int start, int end)
		throws com.liferay.portal.SystemException {
		return getPersistence().findByTableId(tableId, start, end);
	}

	public static java.util.List<com.liferay.portlet.expando.model.ExpandoValue> findByTableId(
		long tableId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException {
		return getPersistence().findByTableId(tableId, start, end, obc);
	}

	public static com.liferay.portlet.expando.model.ExpandoValue findByTableId_First(
		long tableId, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.expando.NoSuchValueException {
		return getPersistence().findByTableId_First(tableId, obc);
	}

	public static com.liferay.portlet.expando.model.ExpandoValue findByTableId_Last(
		long tableId, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.expando.NoSuchValueException {
		return getPersistence().findByTableId_Last(tableId, obc);
	}

	public static com.liferay.portlet.expando.model.ExpandoValue[] findByTableId_PrevAndNext(
		long valueId, long tableId,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.expando.NoSuchValueException {
		return getPersistence().findByTableId_PrevAndNext(valueId, tableId, obc);
	}

	public static java.util.List<com.liferay.portlet.expando.model.ExpandoValue> findByColumnId(
		long columnId) throws com.liferay.portal.SystemException {
		return getPersistence().findByColumnId(columnId);
	}

	public static java.util.List<com.liferay.portlet.expando.model.ExpandoValue> findByColumnId(
		long columnId, int start, int end)
		throws com.liferay.portal.SystemException {
		return getPersistence().findByColumnId(columnId, start, end);
	}

	public static java.util.List<com.liferay.portlet.expando.model.ExpandoValue> findByColumnId(
		long columnId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException {
		return getPersistence().findByColumnId(columnId, start, end, obc);
	}

	public static com.liferay.portlet.expando.model.ExpandoValue findByColumnId_First(
		long columnId, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.expando.NoSuchValueException {
		return getPersistence().findByColumnId_First(columnId, obc);
	}

	public static com.liferay.portlet.expando.model.ExpandoValue findByColumnId_Last(
		long columnId, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.expando.NoSuchValueException {
		return getPersistence().findByColumnId_Last(columnId, obc);
	}

	public static com.liferay.portlet.expando.model.ExpandoValue[] findByColumnId_PrevAndNext(
		long valueId, long columnId,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.expando.NoSuchValueException {
		return getPersistence()
				   .findByColumnId_PrevAndNext(valueId, columnId, obc);
	}

	public static java.util.List<com.liferay.portlet.expando.model.ExpandoValue> findByRowId(
		long rowId) throws com.liferay.portal.SystemException {
		return getPersistence().findByRowId(rowId);
	}

	public static java.util.List<com.liferay.portlet.expando.model.ExpandoValue> findByRowId(
		long rowId, int start, int end)
		throws com.liferay.portal.SystemException {
		return getPersistence().findByRowId(rowId, start, end);
	}

	public static java.util.List<com.liferay.portlet.expando.model.ExpandoValue> findByRowId(
		long rowId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException {
		return getPersistence().findByRowId(rowId, start, end, obc);
	}

	public static com.liferay.portlet.expando.model.ExpandoValue findByRowId_First(
		long rowId, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.expando.NoSuchValueException {
		return getPersistence().findByRowId_First(rowId, obc);
	}

	public static com.liferay.portlet.expando.model.ExpandoValue findByRowId_Last(
		long rowId, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.expando.NoSuchValueException {
		return getPersistence().findByRowId_Last(rowId, obc);
	}

	public static com.liferay.portlet.expando.model.ExpandoValue[] findByRowId_PrevAndNext(
		long valueId, long rowId,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.expando.NoSuchValueException {
		return getPersistence().findByRowId_PrevAndNext(valueId, rowId, obc);
	}

	public static java.util.List<com.liferay.portlet.expando.model.ExpandoValue> findByT_R(
		long tableId, long rowId) throws com.liferay.portal.SystemException {
		return getPersistence().findByT_R(tableId, rowId);
	}

	public static java.util.List<com.liferay.portlet.expando.model.ExpandoValue> findByT_R(
		long tableId, long rowId, int start, int end)
		throws com.liferay.portal.SystemException {
		return getPersistence().findByT_R(tableId, rowId, start, end);
	}

	public static java.util.List<com.liferay.portlet.expando.model.ExpandoValue> findByT_R(
		long tableId, long rowId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException {
		return getPersistence().findByT_R(tableId, rowId, start, end, obc);
	}

	public static com.liferay.portlet.expando.model.ExpandoValue findByT_R_First(
		long tableId, long rowId,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.expando.NoSuchValueException {
		return getPersistence().findByT_R_First(tableId, rowId, obc);
	}

	public static com.liferay.portlet.expando.model.ExpandoValue findByT_R_Last(
		long tableId, long rowId,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.expando.NoSuchValueException {
		return getPersistence().findByT_R_Last(tableId, rowId, obc);
	}

	public static com.liferay.portlet.expando.model.ExpandoValue[] findByT_R_PrevAndNext(
		long valueId, long tableId, long rowId,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.expando.NoSuchValueException {
		return getPersistence()
				   .findByT_R_PrevAndNext(valueId, tableId, rowId, obc);
	}

	public static com.liferay.portlet.expando.model.ExpandoValue findByC_R(
		long columnId, long rowId)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.expando.NoSuchValueException {
		return getPersistence().findByC_R(columnId, rowId);
	}

	public static com.liferay.portlet.expando.model.ExpandoValue fetchByC_R(
		long columnId, long rowId) throws com.liferay.portal.SystemException {
		return getPersistence().fetchByC_R(columnId, rowId);
	}

	public static java.util.List<com.liferay.portlet.expando.model.ExpandoValue> findByC_C(
		long classNameId, long classPK)
		throws com.liferay.portal.SystemException {
		return getPersistence().findByC_C(classNameId, classPK);
	}

	public static java.util.List<com.liferay.portlet.expando.model.ExpandoValue> findByC_C(
		long classNameId, long classPK, int start, int end)
		throws com.liferay.portal.SystemException {
		return getPersistence().findByC_C(classNameId, classPK, start, end);
	}

	public static java.util.List<com.liferay.portlet.expando.model.ExpandoValue> findByC_C(
		long classNameId, long classPK, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException {
		return getPersistence().findByC_C(classNameId, classPK, start, end, obc);
	}

	public static com.liferay.portlet.expando.model.ExpandoValue findByC_C_First(
		long classNameId, long classPK,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.expando.NoSuchValueException {
		return getPersistence().findByC_C_First(classNameId, classPK, obc);
	}

	public static com.liferay.portlet.expando.model.ExpandoValue findByC_C_Last(
		long classNameId, long classPK,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.expando.NoSuchValueException {
		return getPersistence().findByC_C_Last(classNameId, classPK, obc);
	}

	public static com.liferay.portlet.expando.model.ExpandoValue[] findByC_C_PrevAndNext(
		long valueId, long classNameId, long classPK,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.expando.NoSuchValueException {
		return getPersistence()
				   .findByC_C_PrevAndNext(valueId, classNameId, classPK, obc);
	}

	public static com.liferay.portlet.expando.model.ExpandoValue findByT_C_R(
		long tableId, long columnId, long rowId)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.expando.NoSuchValueException {
		return getPersistence().findByT_C_R(tableId, columnId, rowId);
	}

	public static com.liferay.portlet.expando.model.ExpandoValue fetchByT_C_R(
		long tableId, long columnId, long rowId)
		throws com.liferay.portal.SystemException {
		return getPersistence().fetchByT_C_R(tableId, columnId, rowId);
	}

	public static java.util.List<com.liferay.portlet.expando.model.ExpandoValue> findByT_C_C_C(
		long tableId, long columnId, long classNameId, long classPK)
		throws com.liferay.portal.SystemException {
		return getPersistence()
				   .findByT_C_C_C(tableId, columnId, classNameId, classPK);
	}

	public static java.util.List<com.liferay.portlet.expando.model.ExpandoValue> findByT_C_C_C(
		long tableId, long columnId, long classNameId, long classPK, int start,
		int end) throws com.liferay.portal.SystemException {
		return getPersistence()
				   .findByT_C_C_C(tableId, columnId, classNameId, classPK,
			start, end);
	}

	public static java.util.List<com.liferay.portlet.expando.model.ExpandoValue> findByT_C_C_C(
		long tableId, long columnId, long classNameId, long classPK, int start,
		int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException {
		return getPersistence()
				   .findByT_C_C_C(tableId, columnId, classNameId, classPK,
			start, end, obc);
	}

	public static com.liferay.portlet.expando.model.ExpandoValue findByT_C_C_C_First(
		long tableId, long columnId, long classNameId, long classPK,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.expando.NoSuchValueException {
		return getPersistence()
				   .findByT_C_C_C_First(tableId, columnId, classNameId,
			classPK, obc);
	}

	public static com.liferay.portlet.expando.model.ExpandoValue findByT_C_C_C_Last(
		long tableId, long columnId, long classNameId, long classPK,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.expando.NoSuchValueException {
		return getPersistence()
				   .findByT_C_C_C_Last(tableId, columnId, classNameId, classPK,
			obc);
	}

	public static com.liferay.portlet.expando.model.ExpandoValue[] findByT_C_C_C_PrevAndNext(
		long valueId, long tableId, long columnId, long classNameId,
		long classPK, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.expando.NoSuchValueException {
		return getPersistence()
				   .findByT_C_C_C_PrevAndNext(valueId, tableId, columnId,
			classNameId, classPK, obc);
	}

	public static java.util.List<com.liferay.portlet.expando.model.ExpandoValue> findWithDynamicQuery(
		com.liferay.portal.kernel.dao.search.DynamicQueryInitializer queryInitializer)
		throws com.liferay.portal.SystemException {
		return getPersistence().findWithDynamicQuery(queryInitializer);
	}

	public static java.util.List<com.liferay.portlet.expando.model.ExpandoValue> findWithDynamicQuery(
		com.liferay.portal.kernel.dao.search.DynamicQueryInitializer queryInitializer,
		int start, int end) throws com.liferay.portal.SystemException {
		return getPersistence()
				   .findWithDynamicQuery(queryInitializer, start, end);
	}

	public static java.util.List<com.liferay.portlet.expando.model.ExpandoValue> findAll()
		throws com.liferay.portal.SystemException {
		return getPersistence().findAll();
	}

	public static java.util.List<com.liferay.portlet.expando.model.ExpandoValue> findAll(
		int start, int end) throws com.liferay.portal.SystemException {
		return getPersistence().findAll(start, end);
	}

	public static java.util.List<com.liferay.portlet.expando.model.ExpandoValue> findAll(
		int start, int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException {
		return getPersistence().findAll(start, end, obc);
	}

	public static void removeByTableId(long tableId)
		throws com.liferay.portal.SystemException {
		getPersistence().removeByTableId(tableId);
	}

	public static void removeByColumnId(long columnId)
		throws com.liferay.portal.SystemException {
		getPersistence().removeByColumnId(columnId);
	}

	public static void removeByRowId(long rowId)
		throws com.liferay.portal.SystemException {
		getPersistence().removeByRowId(rowId);
	}

	public static void removeByT_R(long tableId, long rowId)
		throws com.liferay.portal.SystemException {
		getPersistence().removeByT_R(tableId, rowId);
	}

	public static void removeByC_R(long columnId, long rowId)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.expando.NoSuchValueException {
		getPersistence().removeByC_R(columnId, rowId);
	}

	public static void removeByC_C(long classNameId, long classPK)
		throws com.liferay.portal.SystemException {
		getPersistence().removeByC_C(classNameId, classPK);
	}

	public static void removeByT_C_R(long tableId, long columnId, long rowId)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.expando.NoSuchValueException {
		getPersistence().removeByT_C_R(tableId, columnId, rowId);
	}

	public static void removeByT_C_C_C(long tableId, long columnId,
		long classNameId, long classPK)
		throws com.liferay.portal.SystemException {
		getPersistence().removeByT_C_C_C(tableId, columnId, classNameId, classPK);
	}

	public static void removeAll() throws com.liferay.portal.SystemException {
		getPersistence().removeAll();
	}

	public static int countByTableId(long tableId)
		throws com.liferay.portal.SystemException {
		return getPersistence().countByTableId(tableId);
	}

	public static int countByColumnId(long columnId)
		throws com.liferay.portal.SystemException {
		return getPersistence().countByColumnId(columnId);
	}

	public static int countByRowId(long rowId)
		throws com.liferay.portal.SystemException {
		return getPersistence().countByRowId(rowId);
	}

	public static int countByT_R(long tableId, long rowId)
		throws com.liferay.portal.SystemException {
		return getPersistence().countByT_R(tableId, rowId);
	}

	public static int countByC_R(long columnId, long rowId)
		throws com.liferay.portal.SystemException {
		return getPersistence().countByC_R(columnId, rowId);
	}

	public static int countByC_C(long classNameId, long classPK)
		throws com.liferay.portal.SystemException {
		return getPersistence().countByC_C(classNameId, classPK);
	}

	public static int countByT_C_R(long tableId, long columnId, long rowId)
		throws com.liferay.portal.SystemException {
		return getPersistence().countByT_C_R(tableId, columnId, rowId);
	}

	public static int countByT_C_C_C(long tableId, long columnId,
		long classNameId, long classPK)
		throws com.liferay.portal.SystemException {
		return getPersistence()
				   .countByT_C_C_C(tableId, columnId, classNameId, classPK);
	}

	public static int countAll() throws com.liferay.portal.SystemException {
		return getPersistence().countAll();
	}

	public static void registerListener(
		com.liferay.portal.model.ModelListener listener) {
		getPersistence().registerListener(listener);
	}

	public static void unregisterListener(
		com.liferay.portal.model.ModelListener listener) {
		getPersistence().unregisterListener(listener);
	}

	public static ExpandoValuePersistence getPersistence() {
		return _getUtil()._persistence;
	}

	public void setPersistence(ExpandoValuePersistence persistence) {
		_persistence = persistence;
	}

	private static ExpandoValueUtil _getUtil() {
		if (_util == null) {
			_util = (ExpandoValueUtil)com.liferay.portal.kernel.bean.BeanLocatorUtil.locate(_UTIL);
		}

		return _util;
	}

	private static final String _UTIL = ExpandoValueUtil.class.getName();
	private static ExpandoValueUtil _util;
	private ExpandoValuePersistence _persistence;
}