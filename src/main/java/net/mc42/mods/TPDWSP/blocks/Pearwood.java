package net.mc42.mods.TPDWSP.blocks;

import net.mc42.mods.LeVCore.LeVBlock;
import net.mc42.mods.TPDWSP.TPDWSP;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class Pearwood extends LeVBlock {
	
	public Pearwood(Material m) {
		super(m);
		// TODO Auto-generated constructor stub
		setBlockTextureName(TPDWSP.MODID + ":pearwood");
		setHarvestLevel("axe",0);
		setHardness(0.5f);
		setStepSound(Block.soundTypeWood);
		setBlockName("pearwood_log"); // changed in 1.7
		setCreativeTab(CreativeTabs.tabBlock);
		setSideCount(2);
	}
	

}
