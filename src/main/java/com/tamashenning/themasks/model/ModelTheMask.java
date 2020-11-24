package com.tamashenning.themasks.model;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/**
 * MyFirstModel - TamasHenning
 * Created using Tabula 8.0.0
 */


@OnlyIn(Dist.CLIENT)
public class ModelTheMask<T extends Entity> extends EntityModel<T> {
    public ModelRenderer Front;
    public ModelRenderer SideLeftTop;
    public ModelRenderer SideLeftBottom;
    public ModelRenderer SideLeftLine;
    public ModelRenderer SideRightTop;
    public ModelRenderer SideRightBottom;
    public ModelRenderer SideLineRight;
    public ModelRenderer SideLeftDot;
    public ModelRenderer SideLeftDot2;
    public ModelRenderer SideLeftDot_1;
    public ModelRenderer SideLeftDot_2;
    public ModelRenderer SideRightDot;
    public ModelRenderer SideRightDot_1;
    public ModelRenderer SideRightDot_2;
    public ModelRenderer SideRightDot_3;

    public ModelTheMask() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.SideRightDot = new ModelRenderer(this, 0, 0);
        this.SideRightDot.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SideRightDot.addBox(6.0F, -0.5F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.SideLeftTop = new ModelRenderer(this, 0, 0);
        this.SideLeftTop.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SideLeftTop.addBox(-3.0F, 0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.SideRightDot_2 = new ModelRenderer(this, 0, 0);
        this.SideRightDot_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SideRightDot_2.addBox(6.0F, 2.0F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.SideRightDot_3 = new ModelRenderer(this, 0, 0);
        this.SideRightDot_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SideRightDot_3.addBox(6.0F, 1.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.SideLeftDot_1 = new ModelRenderer(this, 0, 0);
        this.SideLeftDot_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SideLeftDot_1.addBox(-3.0F, 2.0F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.SideRightBottom = new ModelRenderer(this, 0, 0);
        this.SideRightBottom.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SideRightBottom.addBox(6.0F, 3.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.SideRightTop = new ModelRenderer(this, 0, 0);
        this.SideRightTop.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SideRightTop.addBox(6.0F, 0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.SideLineRight = new ModelRenderer(this, 0, 0);
        this.SideLineRight.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SideLineRight.addBox(6.0F, -1.5F, 2.5F, 1.0F, 3.5F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.SideLeftDot = new ModelRenderer(this, 0, 0);
        this.SideLeftDot.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SideLeftDot.addBox(-3.0F, -0.5F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.SideLeftDot_2 = new ModelRenderer(this, 0, 0);
        this.SideLeftDot_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SideLeftDot_2.addBox(-3.0F, 1.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.SideLeftLine = new ModelRenderer(this, 0, 0);
        this.SideLeftLine.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SideLeftLine.addBox(-3.0F, -1.5F, 2.5F, 1.0F, 3.5F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.Front = new ModelRenderer(this, 0, 0);
        this.Front.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Front.addBox(-3.0F, 1.0F, -1.5F, 10.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.SideLeftDot2 = new ModelRenderer(this, 0, 0);
        this.SideLeftDot2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SideLeftDot2.addBox(-3.0F, -1.5F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.SideRightDot_1 = new ModelRenderer(this, 0, 0);
        this.SideRightDot_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SideRightDot_1.addBox(6.0F, -1.5F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.SideLeftBottom = new ModelRenderer(this, 0, 0);
        this.SideLeftBottom.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SideLeftBottom.addBox(-3.0F, 3.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.SideRightTop.addChild(this.SideRightDot);
        this.SideRightBottom.addChild(this.SideRightDot_2);
        this.SideRightDot_2.addChild(this.SideRightDot_3);
        this.SideLeftBottom.addChild(this.SideLeftDot_1);
        this.SideLeftTop.addChild(this.SideLeftDot);
        this.SideLeftDot_1.addChild(this.SideLeftDot_2);
        this.SideLeftDot.addChild(this.SideLeftDot2);
        this.SideRightDot.addChild(this.SideRightDot_1);
    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.SideRightTop, this.SideLineRight, this.SideRightBottom, this.SideLeftBottom, this.Front, this.SideLeftTop, this.SideLeftLine).forEach((modelRenderer) -> {
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {}

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
