package net.mc42.mods.LeVCore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class LeVBlock extends Block {

	public IIcon[] icons = new IIcon[6];
	private int scount = 1;
	
	public LeVBlock(Material p_i45394_1_) {
		super(p_i45394_1_);
		// TODO Auto-generated constructor stub
	}
	
	public void setSideCount(int c){
		scount = c;
	}
	
	@Override
	public void registerBlockIcons(IIconRegister reg) {
		if(scount <= 1){
			for (int i = 0; i < 6; i ++) {
		    	this.icons[i] = reg.registerIcon(textureName);
		    }
		} else if(scount==2){ 
			for (int i = 0; i < 6; i ++) {
	    		if(i<2){
	    			this.icons[i] = reg.registerIcon(textureName + "_top");
	    		} else {
	    			this.icons[i] = reg.registerIcon(textureName + "_side");
	    		}
	    	}
		} else {
			int i = 0;
			this.icons[i++] = reg.registerIcon(textureName + "_down");
			this.icons[i++] = reg.registerIcon(textureName + "_up");
			this.icons[i++] = reg.registerIcon(textureName + "_n");
			this.icons[i++] = reg.registerIcon(textureName + "_s");
			this.icons[i++] = reg.registerIcon(textureName + "_w");
			this.icons[i++] = reg.registerIcon(textureName + "_e");
		}
	}
	
	@Override
	public IIcon getIcon(int side, int meta) {
	    return this.icons[side];
	}

}
