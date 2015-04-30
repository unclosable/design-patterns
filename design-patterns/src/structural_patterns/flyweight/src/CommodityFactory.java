package structural_patterns.flyweight.src;

import java.util.EnumMap;

import structural_patterns.flyweight.src.commodity.Commodity;
import structural_patterns.flyweight.src.commodity.CommodityType;
import structural_patterns.flyweight.src.commodity.impl.Commodity_common;
import structural_patterns.flyweight.src.commodity.impl.Commodity_devalue;
import structural_patterns.flyweight.src.commodity.impl.Commodity_premium;
import structural_patterns.flyweight.src.commodity.impl.Commodity_rubbish;

public class CommodityFactory {
	private EnumMap<CommodityType, Commodity> commodityMap;

	public CommodityFactory() {
		this.commodityMap = new EnumMap<CommodityType, Commodity>(CommodityType.class);
	}

	public Commodity createCommdity(CommodityType commodityType) {
		Commodity commodity = this.commodityMap.get(commodityType);
		if (commodity == null)
			switch (commodityType) {
			case COMMON:
				commodity = new Commodity_common();
				this.commodityMap.put(commodityType, commodity);
				break;
			case DEVALUE:
				commodity = new Commodity_devalue();
				this.commodityMap.put(commodityType, commodity);
				break;
			case PREMUIM:
				commodity = new Commodity_premium();
				this.commodityMap.put(commodityType, commodity);
				break;
			case RUBBISH:
				commodity = new Commodity_rubbish();
				this.commodityMap.put(commodityType, commodity);
				break;
			default:
				break;
			}
		return commodity;
	}

}
