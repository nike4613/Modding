package net.mc42.mods.TPDWSP.blocks;

import net.mc42.mods.LeVCore.LeVBlock;
import net.mc42.mods.TPDWSP.TPDWSP;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class PearwoodPlanks extends LeVBlock {

	public IIcon[] icons = new IIcon[6];
	
	public PearwoodPlanks(Material m) {
		super(m);
		// TODO Auto-generated constructor stub
		setBlockTextureName(TPDWSP.MODID + ":pearwood_planks");
		setSideCount(1);
		setHarvestLevel("axe",0);
		setHardness(0.5f);
		setStepSound(Block.soundTypeWood);
		setBlockName("pearwood_plank"); // changed in 1.7
		setCreativeTab(CreativeTabs.tabBlock);
	}
	
	/*@Override
	public void registerBlockIcons(IIconRegister reg) {
	    for (int i = 0; i < 6; i ++) {
	    	this.icons[i] = reg.registerIcon(textureName);
	    }
	}
	
	@Override
	public IIcon getIcon(int side, int meta) {
	    return this.icons[side];
	}*/

}
