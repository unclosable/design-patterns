package structural_patterns.flyweight.src;

import java.util.ArrayList;
import java.util.List;

import structural_patterns.flyweight.src.commodity.Commodity;
import structural_patterns.flyweight.src.commodity.CommodityType;

public class Shop {
	private List<Commodity> commodities;

	public Shop() {
		this.commodities = new ArrayList<Commodity>();
		init();
	}

	private void init() {
		CommodityFactory factory = new CommodityFactory();
		/**
		 * 再实现上，可以看到这个商店的商品有很多，实际上同一类型的商品都是指向同一个对象，当商品的状态和这个商品对象无关的时候可以用这个构造
		 */
		/**
		 * 享元
		 */
		this.commodities.add(factory.createCommdity(CommodityType.COMMON));
		this.commodities.add(factory.createCommdity(CommodityType.COMMON));
		this.commodities.add(factory.createCommdity(CommodityType.COMMON));
		this.commodities.add(factory.createCommdity(CommodityType.DEVALUE));
		this.commodities.add(factory.createCommdity(CommodityType.DEVALUE));
		this.commodities.add(factory.createCommdity(CommodityType.DEVALUE));
		this.commodities.add(factory.createCommdity(CommodityType.PREMUIM));
		this.commodities.add(factory.createCommdity(CommodityType.PREMUIM));
		this.commodities.add(factory.createCommdity(CommodityType.PREMUIM));
		this.commodities.add(factory.createCommdity(CommodityType.RUBBISH));
		this.commodities.add(factory.createCommdity(CommodityType.RUBBISH));
		this.commodities.add(factory.createCommdity(CommodityType.RUBBISH));
		this.commodities.add(factory.createCommdity(CommodityType.PREMUIM));
	}

	public void showTheShopPerformance() {
		System.out.println("THIS IS THE PERFOEMANCE OF THE SHOP:");
		for (Commodity commodity : this.commodities) {
			commodity.sale();
		}
	}
}
