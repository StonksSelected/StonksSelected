package net.mcreator.stonks;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.creativetab.CreativeTabs;

@Elementsstonks.ModElement.Tag
public class MCreatorStonksMod extends Elementsstonks.ModElement {
	public MCreatorStonksMod(Elementsstonks instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabstonksmod") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(Items.PAPER, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
