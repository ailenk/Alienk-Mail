package ink.bignose.catmall.coupon.dao;

import ink.bignose.catmall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author Ailenk
 * @websit https://www.bignose.ink
 * @date 2019-04-30 09:39:48
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
