package ink.bignose.catmall.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import ink.bignose.catmall.coupon.entity.SpuBoundsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import ink.bignose.catmall.coupon.service.SpuBoundsService;
import ink.bignose.common.utils.PageUtils;
import ink.bignose.common.utils.R;



/**
 * 商品spu积分设置
 *
 * @author Ailenk
 * @websit https://www.bignose.ink
 * @date 2019-04-30 09:39:49
 */
@RestController
@RequestMapping("coupon/spubounds")
public class SpuBoundsController {

    @Autowired
    private SpuBoundsService spuBoundsService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("coupon:spubounds:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = spuBoundsService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("coupon:spubounds:info")
    public R info(@PathVariable("id") Long id){
		SpuBoundsEntity spuBounds = spuBoundsService.getById(id);

        return R.ok().put("spuBounds", spuBounds);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    // @RequiresPermissions("coupon:spubounds:save")
    public R save(@RequestBody SpuBoundsEntity spuBounds){
		spuBoundsService.save(spuBounds);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("coupon:spubounds:update")
    public R update(@RequestBody SpuBoundsEntity spuBounds){
		spuBoundsService.updateById(spuBounds);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("coupon:spubounds:delete")
    public R delete(@RequestBody Long[] ids){
		spuBoundsService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
