package com.qiuxs.sdriver.biz.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qiuxs.cuteframework.core.persistent.modal.BaseField;
import com.qiuxs.cuteframework.core.persistent.modal.PropertyWrapper;
import com.qiuxs.cuteframework.core.persistent.service.AbstractDataService;
import com.qiuxs.cuteframework.core.persistent.service.filter.IServiceFilter;
import com.qiuxs.cuteframework.core.persistent.service.filter.impl.IdGenerateFilter;
import com.qiuxs.sdriver.biz.dao.FileExtDao;
import com.qiuxs.sdriver.biz.entity.FileExt;

/**
 * 服务类
 *
 * @author qiuxs
 *
 */
@Service
public class FileExtService extends AbstractDataService<Long, FileExt, FileExtDao> {

	private static final String TABLE_NAME = "file_ext";

	public FileExtService() {
		super(Long.class, FileExt.class, TABLE_NAME);
	}

	@Resource
	private FileExtDao fileExtDao;

	@Override
	protected FileExtDao getDao() {
		return this.fileExtDao;
	}

	@Override
	protected void initServiceFilters(List<IServiceFilter<Long, FileExt>> serviceFilters) {
		serviceFilters.add(new IdGenerateFilter<>(TABLE_NAME));
	}

	@Override
	protected void initProps(List<PropertyWrapper<?>> props) {
		PropertyWrapper<?> prop = null;

		prop = new PropertyWrapper<Long>(new BaseField("id", "主键", "Long"), null);
		props.add(prop);

		prop = new PropertyWrapper<String>(new BaseField("extName", "文件扩展名", "String"), null);
		props.add(prop);

		prop = new PropertyWrapper<Long>(new BaseField("size", "文件大小", "Long"), null);
		props.add(prop);

	}

}
