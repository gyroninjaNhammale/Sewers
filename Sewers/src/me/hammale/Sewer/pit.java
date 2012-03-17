package me.hammale.Sewer;

import java.util.Random;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;

public class pit
{
  Random gen = new Random();

  public int pit1(Block set, Material m, BlockFace bf) { int x = 1;
    int a = gen.nextInt(30);
    if (a < 12) {
      a = 12;
    }
    while (x < a) {
      int newx = x - 1;
      Block otherset = set.getRelative(bf, newx);
      Block clr10 = otherset.getRelative(BlockFace.DOWN, 1);
      Block clr20 = otherset.getRelative(BlockFace.DOWN, 2);
      Block clr30 = otherset.getRelative(BlockFace.DOWN, 3);
      Block clr40 = otherset.getRelative(BlockFace.DOWN, 4);
      Block clr50 = otherset.getRelative(BlockFace.DOWN, 5);
      Block clr60 = otherset.getRelative(BlockFace.DOWN, 6);
      Block clr70 = otherset.getRelative(BlockFace.DOWN, 7);
      Block set1 = otherset.getRelative(BlockFace.SOUTH, 1);
      Block clr1 = set1.getRelative(BlockFace.DOWN, 1);
      Block clr2 = set1.getRelative(BlockFace.DOWN, 2);
      Block clr3 = set1.getRelative(BlockFace.DOWN, 3);
      Block clr4 = set1.getRelative(BlockFace.DOWN, 4);
      Block clr5 = set1.getRelative(BlockFace.DOWN, 5);
      Block clr6 = set1.getRelative(BlockFace.DOWN, 6);
      Block clr7 = set1.getRelative(BlockFace.DOWN, 7);
      Block set2 = set1.getRelative(BlockFace.SOUTH, 1);
      Block clr11 = set2.getRelative(BlockFace.DOWN, 1);
      Block clr21 = set2.getRelative(BlockFace.DOWN, 2);
      Block clr31 = set2.getRelative(BlockFace.DOWN, 3);
      Block clr41 = set2.getRelative(BlockFace.DOWN, 4);
      Block clr51 = set2.getRelative(BlockFace.DOWN, 5);
      Block clr61 = set2.getRelative(BlockFace.DOWN, 6);
      Block clr71 = set2.getRelative(BlockFace.DOWN, 7);
      Block set1111 = set2.getRelative(BlockFace.SOUTH, 1);
      Block clr111 = set1111.getRelative(BlockFace.DOWN, 1);
      Block clr211 = set1111.getRelative(BlockFace.DOWN, 2);
      Block clr311 = set1111.getRelative(BlockFace.DOWN, 3);
      Block clr411 = set1111.getRelative(BlockFace.DOWN, 4);
      Block clr511 = set1111.getRelative(BlockFace.DOWN, 5);
      Block clr611 = set1111.getRelative(BlockFace.DOWN, 6);
      Block clr711 = set1111.getRelative(BlockFace.DOWN, 7);
      Block set2111 = set1111.getRelative(BlockFace.SOUTH, 1);
      Block clr1111 = set2111.getRelative(BlockFace.DOWN, 1);
      Block clr2111 = set2111.getRelative(BlockFace.DOWN, 2);
      Block clr3111 = set2111.getRelative(BlockFace.DOWN, 3);
      Block clr4111 = set2111.getRelative(BlockFace.DOWN, 4);
      Block clr5111 = set2111.getRelative(BlockFace.DOWN, 5);
      Block clr6111 = set2111.getRelative(BlockFace.DOWN, 6);
      Block clr7111 = set2111.getRelative(BlockFace.DOWN, 7);
      Block set3111 = set2111.getRelative(BlockFace.SOUTH, 1);
      Block clr11111 = set3111.getRelative(BlockFace.DOWN, 1);
      Block clr21111 = set3111.getRelative(BlockFace.DOWN, 2);
      Block clr31111 = set3111.getRelative(BlockFace.DOWN, 3);
      Block clr41111 = set3111.getRelative(BlockFace.DOWN, 4);
      Block clr51111 = set3111.getRelative(BlockFace.DOWN, 5);
      Block clr61111 = set3111.getRelative(BlockFace.DOWN, 6);
      Block clr71111 = set3111.getRelative(BlockFace.DOWN, 7);
      Block set4111 = set3111.getRelative(BlockFace.SOUTH, 1);

      Block clr5111111 = set4111.getRelative(BlockFace.DOWN, 5);

      Block set3 = otherset.getRelative(BlockFace.SOUTH, 1);
      Block clr111111 = set3.getRelative(BlockFace.DOWN, 1);
      Block clr211111 = set3.getRelative(BlockFace.DOWN, 2);
      Block clr311111 = set3.getRelative(BlockFace.DOWN, 3);
      Block clr411111 = set3.getRelative(BlockFace.DOWN, 4);
      Block clr511111 = set3.getRelative(BlockFace.DOWN, 5);
      Block clr611111 = set3.getRelative(BlockFace.DOWN, 6);
      Block clr711111 = set3.getRelative(BlockFace.DOWN, 7);

      int other = gen.nextInt(3);
      set3.setType(m);
      set3.setData((byte)other);

      int ran2 = gen.nextInt(3);
      otherset.setType(m);
      otherset.setData((byte)ran2);

      int ran = gen.nextInt(3);
      set1.setType(m);
      set1.setData((byte)ran);

      int ran1 = gen.nextInt(3);
      set2.setType(m);
      set2.setData((byte)ran1);

      int ran1111 = gen.nextInt(3);
      set1111.setType(m);
      set1111.setData((byte)ran1111);

      int ran2111 = gen.nextInt(3);
      set2111.setType(m);
      set2111.setData((byte)ran2111);

      int ran3111 = gen.nextInt(3);
      set3111.setType(m);
      set3111.setData((byte)ran3111);

      int ran4111 = gen.nextInt(3);
      set4111.setType(m);
      set4111.setData((byte)ran4111);

      Block set5 = set4111.getRelative(BlockFace.DOWN, 1);
      Block set6 = set5.getRelative(BlockFace.DOWN, 1);
      Block set7 = set6.getRelative(BlockFace.DOWN, 1);
      Block set8 = set7.getRelative(BlockFace.DOWN, 1);
      Block set51 = set8.getRelative(BlockFace.DOWN, 1);
      Block set61 = set51.getRelative(BlockFace.DOWN, 1);
      Block set71 = set61.getRelative(BlockFace.DOWN, 1);
      Block set81 = set71.getRelative(BlockFace.DOWN, 1);
      int ran3 = gen.nextInt(3);
      int ran7 = gen.nextInt(3);
      int ran5 = gen.nextInt(3);
      int ran6 = gen.nextInt(3);
      set5.setType(m);
      int rtorch1 = gen.nextInt(5);
      if (rtorch1 == 1) {
        byte flags = 5;
        set5.setType(Material.TORCH);
        set5.setTypeIdAndData(50, flags, true);
      }
      set5.setData((byte)ran3);
      set6.setType(m);
      set6.setData((byte)ran7);
      set7.setType(m);
      set7.setData((byte)ran5);
      set8.setType(m);
      set8.setData((byte)ran6);

      int ran31 = gen.nextInt(3);
      int ran71 = gen.nextInt(3);
      int ran51 = gen.nextInt(3);
      int ran61 = gen.nextInt(3);
      set51.setType(m);
      int rtorch11 = gen.nextInt(5);
      if (rtorch11 == 1) {
        byte flags = 5;
        set5.setType(Material.TORCH);
        set5.setTypeIdAndData(50, flags, true);
      }
      set51.setData((byte)ran31);
      set61.setType(m);
      set61.setData((byte)ran71);
      set71.setType(m);
      set71.setData((byte)ran51);
      set81.setType(m);
      set81.setData((byte)ran61);

      Block set9 = set81.getRelative(BlockFace.NORTH, 1);
      Block set10 = set9.getRelative(BlockFace.NORTH, 1);
      Block set11 = set10.getRelative(BlockFace.NORTH, 1);
      Block set12 = set11.getRelative(BlockFace.NORTH, 1);
      Block set91 = set12.getRelative(BlockFace.NORTH, 1);
      Block set101 = set91.getRelative(BlockFace.NORTH, 1);
      Block set111 = set101.getRelative(BlockFace.NORTH, 1);
      Block set121 = set111.getRelative(BlockFace.NORTH, 1);
      Block set122 = set1.getRelative(BlockFace.NORTH, 2);

      int ran11 = gen.nextInt(3);
      int ran8 = gen.nextInt(3);
      int ran9 = gen.nextInt(3);
      int ran10 = gen.nextInt(3);
      set9.setType(m);
      set9.setData((byte)ran11);
      set10.setType(m);
      set10.setData((byte)ran8);
      set11.setType(m);
      set11.setData((byte)ran9);
      set12.setType(m);
      set12.setData((byte)ran10);
      int ran91 = gen.nextInt(3);
      int ran101 = gen.nextInt(3);
      int ran111 = gen.nextInt(3);
      int ran121 = gen.nextInt(3);
      set91.setType(m);
      set91.setData((byte)ran91);
      set101.setType(m);
      set101.setData((byte)ran101);
      set111.setType(m);
      set111.setData((byte)ran111);
      set121.setType(m);
      set121.setData((byte)ran121);
      set122.setType(m);
      set122.setData((byte)ran1);

      Block set13 = set121.getRelative(BlockFace.UP, 1);
      Block set14 = set13.getRelative(BlockFace.UP, 1);
      Block set15 = set14.getRelative(BlockFace.UP, 1);
      Block set16 = set15.getRelative(BlockFace.UP, 1);
      Block set17 = set16.getRelative(BlockFace.UP, 1);
      Block set18 = set17.getRelative(BlockFace.UP, 1);
      Block set19 = set18.getRelative(BlockFace.UP, 1);
      Block set20 = set19.getRelative(BlockFace.UP, 1);
      int ran12 = gen.nextInt(3);
      int ran13 = gen.nextInt(3);
      int ran14 = gen.nextInt(3);
      int ran15 = gen.nextInt(3);
      set13.setType(m);
      set13.setData((byte)ran12);
      set14.setType(m);
      set14.setData((byte)ran13);
      set15.setType(m);
      set15.setData((byte)ran14);
      set16.setType(m);
      set16.setData((byte)ran15);
      int ran17 = gen.nextInt(3);
      int ran18 = gen.nextInt(3);
      int ran19 = gen.nextInt(3);
      int ran20 = gen.nextInt(3);
      set17.setType(m);
      set17.setData((byte)ran17);
      set18.setType(m);
      set18.setData((byte)ran18);
      set19.setType(m);
      set19.setData((byte)ran19);
      set20.setType(m);
      set20.setData((byte)ran20);

      if (x == 1) {
        clr1.setType(Material.SMOOTH_BRICK);
        clr10.setType(Material.SMOOTH_BRICK);
        clr11.setType(Material.SMOOTH_BRICK);
        clr111.setType(Material.SMOOTH_BRICK);
        clr1111.setType(Material.SMOOTH_BRICK);
        clr11111.setType(Material.SMOOTH_BRICK);
        clr111111.setType(Material.SMOOTH_BRICK);

        clr2.setType(Material.SMOOTH_BRICK);
        clr20.setType(Material.SMOOTH_BRICK);
        clr21.setType(Material.SMOOTH_BRICK);
        clr211.setType(Material.SMOOTH_BRICK);
        clr2111.setType(Material.SMOOTH_BRICK);
        clr21111.setType(Material.SMOOTH_BRICK);
        clr211111.setType(Material.SMOOTH_BRICK);

        clr3.setType(Material.SMOOTH_BRICK);
        clr30.setType(Material.SMOOTH_BRICK);
        clr31.setType(Material.SMOOTH_BRICK);
        clr311.setType(Material.SMOOTH_BRICK);
        clr3111.setType(Material.SMOOTH_BRICK);
        clr31111.setType(Material.SMOOTH_BRICK);
        clr311111.setType(Material.SMOOTH_BRICK);

        clr4.setType(Material.SMOOTH_BRICK);
        clr40.setType(Material.SMOOTH_BRICK);
        clr41.setType(Material.SMOOTH_BRICK);
        clr411.setType(Material.SMOOTH_BRICK);
        clr4111.setType(Material.SMOOTH_BRICK);
        clr41111.setType(Material.SMOOTH_BRICK);
        clr411111.setType(Material.SMOOTH_BRICK);

        int w = 1;
        while (w < 8) {
          Block clearer = set122.getRelative(BlockFace.DOWN, w);
          clearer.setType(Material.SMOOTH_BRICK);
          w++;
        }

        clr5.setType(Material.SMOOTH_BRICK);
        clr50.setType(Material.SMOOTH_BRICK);
        clr51.setType(Material.SMOOTH_BRICK);
        clr511.setType(Material.SMOOTH_BRICK);
        clr5111.setType(Material.SMOOTH_BRICK);
        clr51111.setType(Material.SMOOTH_BRICK);
        clr511111.setType(Material.SMOOTH_BRICK);
        clr5111111.setType(Material.SMOOTH_BRICK);

        clr6.setType(Material.SMOOTH_BRICK);
        clr60.setType(Material.SMOOTH_BRICK);
        clr61.setType(Material.SMOOTH_BRICK);
        clr611.setType(Material.SMOOTH_BRICK);
        clr6111.setType(Material.SMOOTH_BRICK);
        clr61111.setType(Material.SMOOTH_BRICK);
        clr611111.setType(Material.SMOOTH_BRICK);

        clr7.setType(Material.SMOOTH_BRICK);
        clr70.setType(Material.SMOOTH_BRICK);
        clr71.setType(Material.SMOOTH_BRICK);
        clr711.setType(Material.SMOOTH_BRICK);
        clr7111.setType(Material.SMOOTH_BRICK);
        clr71111.setType(Material.SMOOTH_BRICK);
        clr711111.setType(Material.SMOOTH_BRICK);
      } else if (x + 1 == a) {
        clr1.setType(Material.IRON_FENCE);
        clr10.setType(Material.IRON_FENCE);
        clr11.setType(Material.IRON_FENCE);
        clr111.setType(Material.IRON_FENCE);
        clr1111.setType(Material.IRON_FENCE);
        clr11111.setType(Material.IRON_FENCE);
        clr111111.setType(Material.IRON_FENCE);

        clr2.setType(Material.IRON_FENCE);
        clr20.setType(Material.IRON_FENCE);
        clr21.setType(Material.IRON_FENCE);
        clr211.setType(Material.IRON_FENCE);
        clr2111.setType(Material.IRON_FENCE);
        clr21111.setType(Material.IRON_FENCE);
        clr211111.setType(Material.IRON_FENCE);

        clr3.setType(Material.IRON_FENCE);
        clr30.setType(Material.IRON_FENCE);
        clr31.setType(Material.IRON_FENCE);
        clr311.setType(Material.IRON_FENCE);
        clr3111.setType(Material.IRON_FENCE);
        clr31111.setType(Material.IRON_FENCE);
        clr311111.setType(Material.IRON_FENCE);

        clr4.setType(Material.IRON_FENCE);
        clr40.setType(Material.IRON_FENCE);
        clr41.setType(Material.IRON_FENCE);
        clr411.setType(Material.IRON_FENCE);
        clr4111.setType(Material.IRON_FENCE);
        clr41111.setType(Material.IRON_FENCE);
        clr411111.setType(Material.IRON_FENCE);

        int w = 1;
        while (w < 8) {
          Block clearer = set122.getRelative(BlockFace.DOWN, w);
          clearer.setType(Material.IRON_FENCE);
          w++;
        }

        clr5.setType(Material.IRON_FENCE);
        clr50.setType(Material.IRON_FENCE);
        clr51.setType(Material.IRON_FENCE);
        clr511.setType(Material.IRON_FENCE);
        clr5111.setType(Material.IRON_FENCE);
        clr51111.setType(Material.IRON_FENCE);
        clr511111.setType(Material.IRON_FENCE);
        clr5111111.setType(Material.IRON_FENCE);

        clr6.setType(Material.IRON_FENCE);
        clr60.setType(Material.IRON_FENCE);
        clr61.setType(Material.IRON_FENCE);
        clr611.setType(Material.IRON_FENCE);
        clr6111.setType(Material.IRON_FENCE);
        clr61111.setType(Material.IRON_FENCE);
        clr611111.setType(Material.IRON_FENCE);

        clr7.setType(Material.IRON_FENCE);
        clr70.setType(Material.IRON_FENCE);
        clr71.setType(Material.IRON_FENCE);
        clr711.setType(Material.IRON_FENCE);
        clr7111.setType(Material.IRON_FENCE);
        clr71111.setType(Material.IRON_FENCE);
        clr711111.setType(Material.IRON_FENCE);
      } else {
        clr1.setType(Material.AIR);
        clr10.setType(Material.AIR);
        clr11.setType(Material.AIR);
        clr111.setType(Material.AIR);
        clr1111.setType(Material.AIR);
        clr11111.setType(Material.AIR);
        clr111111.setType(Material.AIR);

        clr2.setType(Material.AIR);
        clr20.setType(Material.AIR);
        clr21.setType(Material.AIR);
        clr211.setType(Material.AIR);
        clr2111.setType(Material.AIR);
        clr21111.setType(Material.AIR);
        clr211111.setType(Material.AIR);

        clr3.setType(Material.AIR);
        clr30.setType(Material.AIR);
        clr31.setType(Material.AIR);
        clr311.setType(Material.AIR);
        clr3111.setType(Material.AIR);
        clr31111.setType(Material.AIR);
        clr311111.setType(Material.AIR);

        clr4.setType(Material.AIR);
        clr40.setType(Material.AIR);
        clr41.setType(Material.AIR);
        clr411.setType(Material.AIR);
        clr4111.setType(Material.AIR);
        clr41111.setType(Material.AIR);
        clr411111.setType(Material.AIR);

        int w = 1;
        while (w < 8) {
          Block clearer = set122.getRelative(BlockFace.DOWN, w);
          clearer.setType(Material.AIR);
          w++;
        }

        clr5.setType(Material.AIR);
        clr50.setType(Material.AIR);
        clr51.setType(Material.AIR);
        clr511.setType(Material.AIR);
        clr5111.setType(Material.AIR);
        clr51111.setType(Material.WATER);
        clr511111.setType(Material.AIR);
        clr5111111.setType(Material.IRON_FENCE);

        clr6.setType(Material.WATER);
        clr60.setType(Material.WATER);
        clr61.setType(Material.WATER);
        clr611.setType(Material.WATER);
        clr6111.setType(Material.WATER);
        clr61111.setType(Material.WATER);
        clr611111.setType(Material.WATER);

        clr7.setType(Material.WATER);
        clr70.setType(Material.WATER);
        clr71.setType(Material.WATER);
        clr711.setType(Material.WATER);
        clr7111.setType(Material.WATER);
        clr71111.setType(Material.WATER);
        clr711111.setType(Material.WATER);
      }
      newx++;
      x++;
    }
    return a; }

  public int pit2(Block set, Material m, BlockFace bf)
  {
    int x = 1;
    int a = gen.nextInt(30);
    if (a < 12) {
      a = 12;
    }
    while (x < a) {
      int newx = x - 1;
      Block otherset = set.getRelative(bf, newx);
      Block clr10 = otherset.getRelative(BlockFace.DOWN, 1);
      Block clr20 = otherset.getRelative(BlockFace.DOWN, 2);
      Block clr30 = otherset.getRelative(BlockFace.DOWN, 3);
      Block clr40 = otherset.getRelative(BlockFace.DOWN, 4);
      Block clr50 = otherset.getRelative(BlockFace.DOWN, 5);
      Block clr60 = otherset.getRelative(BlockFace.DOWN, 6);
      Block clr70 = otherset.getRelative(BlockFace.DOWN, 7);
      Block set1 = otherset.getRelative(BlockFace.SOUTH, 1);
      Block clr1 = set1.getRelative(BlockFace.DOWN, 1);
      Block clr2 = set1.getRelative(BlockFace.DOWN, 2);
      Block clr3 = set1.getRelative(BlockFace.DOWN, 3);
      Block clr4 = set1.getRelative(BlockFace.DOWN, 4);
      Block clr5 = set1.getRelative(BlockFace.DOWN, 5);
      Block clr6 = set1.getRelative(BlockFace.DOWN, 6);
      Block clr7 = set1.getRelative(BlockFace.DOWN, 7);
      Block set2 = set1.getRelative(BlockFace.SOUTH, 1);
      Block clr11 = set2.getRelative(BlockFace.DOWN, 1);
      Block clr21 = set2.getRelative(BlockFace.DOWN, 2);
      Block clr31 = set2.getRelative(BlockFace.DOWN, 3);
      Block clr41 = set2.getRelative(BlockFace.DOWN, 4);
      Block clr51 = set2.getRelative(BlockFace.DOWN, 5);
      Block clr61 = set2.getRelative(BlockFace.DOWN, 6);
      Block clr71 = set2.getRelative(BlockFace.DOWN, 7);
      Block set1111 = set2.getRelative(BlockFace.SOUTH, 1);
      Block clr111 = set1111.getRelative(BlockFace.DOWN, 1);
      Block clr211 = set1111.getRelative(BlockFace.DOWN, 2);
      Block clr311 = set1111.getRelative(BlockFace.DOWN, 3);
      Block clr411 = set1111.getRelative(BlockFace.DOWN, 4);
      Block clr511 = set1111.getRelative(BlockFace.DOWN, 5);
      Block clr611 = set1111.getRelative(BlockFace.DOWN, 6);
      Block clr711 = set1111.getRelative(BlockFace.DOWN, 7);
      Block set2111 = set1111.getRelative(BlockFace.SOUTH, 1);
      Block clr1111 = set2111.getRelative(BlockFace.DOWN, 1);
      Block clr2111 = set2111.getRelative(BlockFace.DOWN, 2);
      Block clr3111 = set2111.getRelative(BlockFace.DOWN, 3);
      Block clr4111 = set2111.getRelative(BlockFace.DOWN, 4);
      Block clr5111 = set2111.getRelative(BlockFace.DOWN, 5);
      Block clr6111 = set2111.getRelative(BlockFace.DOWN, 6);
      Block clr7111 = set2111.getRelative(BlockFace.DOWN, 7);
      Block set3111 = set2111.getRelative(BlockFace.SOUTH, 1);
      Block clr11111 = set3111.getRelative(BlockFace.DOWN, 1);
      Block clr21111 = set3111.getRelative(BlockFace.DOWN, 2);
      Block clr31111 = set3111.getRelative(BlockFace.DOWN, 3);
      Block clr41111 = set3111.getRelative(BlockFace.DOWN, 4);
      Block clr51111 = set3111.getRelative(BlockFace.DOWN, 5);
      Block clr61111 = set3111.getRelative(BlockFace.DOWN, 6);
      Block clr71111 = set3111.getRelative(BlockFace.DOWN, 7);
      Block set4111 = set3111.getRelative(BlockFace.SOUTH, 1);

      Block clr5111111 = set4111.getRelative(BlockFace.DOWN, 5);

      Block set3 = otherset.getRelative(BlockFace.SOUTH, 1);
      Block clr111111 = set3.getRelative(BlockFace.DOWN, 1);
      Block clr211111 = set3.getRelative(BlockFace.DOWN, 2);
      Block clr311111 = set3.getRelative(BlockFace.DOWN, 3);
      Block clr411111 = set3.getRelative(BlockFace.DOWN, 4);
      Block clr511111 = set3.getRelative(BlockFace.DOWN, 5);
      Block clr611111 = set3.getRelative(BlockFace.DOWN, 6);
      Block clr711111 = set3.getRelative(BlockFace.DOWN, 7);

      int other = gen.nextInt(3);
      set3.setType(m);
      set3.setData((byte)other);

      int ran2 = gen.nextInt(3);
      otherset.setType(m);
      otherset.setData((byte)ran2);

      int ran = gen.nextInt(3);
      set1.setType(m);
      set1.setData((byte)ran);

      int ran1 = gen.nextInt(3);
      set2.setType(m);
      set2.setData((byte)ran1);

      int ran1111 = gen.nextInt(3);
      set1111.setType(m);
      set1111.setData((byte)ran1111);

      int ran2111 = gen.nextInt(3);
      set2111.setType(m);
      set2111.setData((byte)ran2111);

      int ran3111 = gen.nextInt(3);
      set3111.setType(m);
      set3111.setData((byte)ran3111);

      int ran4111 = gen.nextInt(3);
      set4111.setType(m);
      set4111.setData((byte)ran4111);

      Block set5 = set4111.getRelative(BlockFace.DOWN, 1);
      Block set6 = set5.getRelative(BlockFace.DOWN, 1);
      Block set7 = set6.getRelative(BlockFace.DOWN, 1);
      Block set8 = set7.getRelative(BlockFace.DOWN, 1);
      Block set51 = set8.getRelative(BlockFace.DOWN, 1);
      Block set61 = set51.getRelative(BlockFace.DOWN, 1);
      Block set71 = set61.getRelative(BlockFace.DOWN, 1);
      Block set81 = set71.getRelative(BlockFace.DOWN, 1);
      int ran3 = gen.nextInt(3);
      int ran7 = gen.nextInt(3);
      int ran5 = gen.nextInt(3);
      int ran6 = gen.nextInt(3);
      set5.setType(m);
      int rtorch1 = gen.nextInt(5);
      if (rtorch1 == 1) {
        byte flags = 5;
        set5.setType(Material.TORCH);
        set5.setTypeIdAndData(50, flags, true);
      }
      set5.setData((byte)ran3);
      set6.setType(m);
      set6.setData((byte)ran7);
      set7.setType(m);
      set7.setData((byte)ran5);
      set8.setType(m);
      set8.setData((byte)ran6);

      int ran31 = gen.nextInt(3);
      int ran71 = gen.nextInt(3);
      int ran51 = gen.nextInt(3);
      int ran61 = gen.nextInt(3);
      set51.setType(m);
      int rtorch11 = gen.nextInt(5);
      if (rtorch11 == 1) {
        byte flags = 5;
        set5.setType(Material.TORCH);
        set5.setTypeIdAndData(50, flags, true);
      }
      set51.setData((byte)ran31);
      set61.setType(m);
      set61.setData((byte)ran71);
      set71.setType(m);
      set71.setData((byte)ran51);
      set81.setType(m);
      set81.setData((byte)ran61);

      Block set9 = set81.getRelative(BlockFace.NORTH, 1);
      Block set10 = set9.getRelative(BlockFace.NORTH, 1);
      Block set11 = set10.getRelative(BlockFace.NORTH, 1);
      Block set12 = set11.getRelative(BlockFace.NORTH, 1);
      Block set91 = set12.getRelative(BlockFace.NORTH, 1);
      Block set101 = set91.getRelative(BlockFace.NORTH, 1);
      Block set111 = set101.getRelative(BlockFace.NORTH, 1);
      Block set121 = set111.getRelative(BlockFace.NORTH, 1);
      Block set122 = set1.getRelative(BlockFace.NORTH, 2);

      int ran11 = gen.nextInt(3);
      int ran8 = gen.nextInt(3);
      int ran9 = gen.nextInt(3);
      int ran10 = gen.nextInt(3);
      set9.setType(m);
      set9.setData((byte)ran11);
      set10.setType(m);
      set10.setData((byte)ran8);
      set11.setType(m);
      set11.setData((byte)ran9);
      set12.setType(m);
      set12.setData((byte)ran10);
      int ran91 = gen.nextInt(3);
      int ran101 = gen.nextInt(3);
      int ran111 = gen.nextInt(3);
      int ran121 = gen.nextInt(3);
      set91.setType(m);
      set91.setData((byte)ran91);
      set101.setType(m);
      set101.setData((byte)ran101);
      set111.setType(m);
      set111.setData((byte)ran111);
      set121.setType(m);
      set121.setData((byte)ran121);
      set122.setType(m);
      set122.setData((byte)ran1);

      Block set13 = set121.getRelative(BlockFace.UP, 1);
      Block set14 = set13.getRelative(BlockFace.UP, 1);
      Block set15 = set14.getRelative(BlockFace.UP, 1);
      Block set16 = set15.getRelative(BlockFace.UP, 1);
      Block set17 = set16.getRelative(BlockFace.UP, 1);
      Block set18 = set17.getRelative(BlockFace.UP, 1);
      Block set19 = set18.getRelative(BlockFace.UP, 1);
      Block set20 = set19.getRelative(BlockFace.UP, 1);
      int ran12 = gen.nextInt(3);
      int ran13 = gen.nextInt(3);
      int ran14 = gen.nextInt(3);
      int ran15 = gen.nextInt(3);
      set13.setType(m);
      set13.setData((byte)ran12);
      set14.setType(m);
      set14.setData((byte)ran13);
      set15.setType(m);
      set15.setData((byte)ran14);
      set16.setType(m);
      set16.setData((byte)ran15);
      int ran17 = gen.nextInt(3);
      int ran18 = gen.nextInt(3);
      int ran19 = gen.nextInt(3);
      int ran20 = gen.nextInt(3);
      set17.setType(m);
      set17.setData((byte)ran17);
      set18.setType(m);
      set18.setData((byte)ran18);
      set19.setType(m);
      set19.setData((byte)ran19);
      set20.setType(m);
      set20.setData((byte)ran20);

      if (x == 1) {
        clr1.setType(Material.SMOOTH_BRICK);
        clr10.setType(Material.SMOOTH_BRICK);
        clr11.setType(Material.SMOOTH_BRICK);
        clr111.setType(Material.SMOOTH_BRICK);
        clr1111.setType(Material.SMOOTH_BRICK);
        clr11111.setType(Material.SMOOTH_BRICK);
        clr111111.setType(Material.SMOOTH_BRICK);

        clr2.setType(Material.SMOOTH_BRICK);
        clr20.setType(Material.SMOOTH_BRICK);
        clr21.setType(Material.SMOOTH_BRICK);
        clr211.setType(Material.SMOOTH_BRICK);
        clr2111.setType(Material.SMOOTH_BRICK);
        clr21111.setType(Material.SMOOTH_BRICK);
        clr211111.setType(Material.SMOOTH_BRICK);

        clr3.setType(Material.SMOOTH_BRICK);
        clr30.setType(Material.SMOOTH_BRICK);
        clr31.setType(Material.SMOOTH_BRICK);
        clr311.setType(Material.SMOOTH_BRICK);
        clr3111.setType(Material.SMOOTH_BRICK);
        clr31111.setType(Material.SMOOTH_BRICK);
        clr311111.setType(Material.SMOOTH_BRICK);

        clr4.setType(Material.SMOOTH_BRICK);
        clr40.setType(Material.SMOOTH_BRICK);
        clr41.setType(Material.SMOOTH_BRICK);
        clr411.setType(Material.SMOOTH_BRICK);
        clr4111.setType(Material.SMOOTH_BRICK);
        clr41111.setType(Material.SMOOTH_BRICK);
        clr411111.setType(Material.SMOOTH_BRICK);

        int w = 1;
        while (w < 8) {
          Block clearer = set122.getRelative(BlockFace.DOWN, w);
          clearer.setType(Material.SMOOTH_BRICK);
          w++;
        }

        clr5.setType(Material.SMOOTH_BRICK);
        clr50.setType(Material.SMOOTH_BRICK);
        clr51.setType(Material.SMOOTH_BRICK);
        clr511.setType(Material.SMOOTH_BRICK);
        clr5111.setType(Material.SMOOTH_BRICK);
        clr51111.setType(Material.SMOOTH_BRICK);
        clr511111.setType(Material.SMOOTH_BRICK);
        clr5111111.setType(Material.SMOOTH_BRICK);

        clr6.setType(Material.SMOOTH_BRICK);
        clr60.setType(Material.SMOOTH_BRICK);
        clr61.setType(Material.SMOOTH_BRICK);
        clr611.setType(Material.SMOOTH_BRICK);
        clr6111.setType(Material.SMOOTH_BRICK);
        clr61111.setType(Material.SMOOTH_BRICK);
        clr611111.setType(Material.SMOOTH_BRICK);

        clr7.setType(Material.SMOOTH_BRICK);
        clr70.setType(Material.SMOOTH_BRICK);
        clr71.setType(Material.SMOOTH_BRICK);
        clr711.setType(Material.SMOOTH_BRICK);
        clr7111.setType(Material.SMOOTH_BRICK);
        clr71111.setType(Material.SMOOTH_BRICK);
        clr711111.setType(Material.SMOOTH_BRICK);
      } else if (x + 1 == a) {
        clr1.setType(Material.IRON_FENCE);
        clr10.setType(Material.IRON_FENCE);
        clr11.setType(Material.IRON_FENCE);
        clr111.setType(Material.IRON_FENCE);
        clr1111.setType(Material.IRON_FENCE);
        clr11111.setType(Material.IRON_FENCE);
        clr111111.setType(Material.IRON_FENCE);

        clr2.setType(Material.IRON_FENCE);
        clr20.setType(Material.IRON_FENCE);
        clr21.setType(Material.IRON_FENCE);
        clr211.setType(Material.IRON_FENCE);
        clr2111.setType(Material.IRON_FENCE);
        clr21111.setType(Material.IRON_FENCE);
        clr211111.setType(Material.IRON_FENCE);

        clr3.setType(Material.IRON_FENCE);
        clr30.setType(Material.IRON_FENCE);
        clr31.setType(Material.IRON_FENCE);
        clr311.setType(Material.IRON_FENCE);
        clr3111.setType(Material.IRON_FENCE);
        clr31111.setType(Material.IRON_FENCE);
        clr311111.setType(Material.IRON_FENCE);

        clr4.setType(Material.IRON_FENCE);
        clr40.setType(Material.IRON_FENCE);
        clr41.setType(Material.IRON_FENCE);
        clr411.setType(Material.IRON_FENCE);
        clr4111.setType(Material.IRON_FENCE);
        clr41111.setType(Material.IRON_FENCE);
        clr411111.setType(Material.IRON_FENCE);

        int w = 1;
        while (w < 8) {
          Block clearer = set122.getRelative(BlockFace.DOWN, w);
          clearer.setType(Material.IRON_FENCE);
          w++;
        }

        clr5.setType(Material.IRON_FENCE);
        clr50.setType(Material.IRON_FENCE);
        clr51.setType(Material.IRON_FENCE);
        clr511.setType(Material.IRON_FENCE);
        clr5111.setType(Material.IRON_FENCE);
        clr51111.setType(Material.IRON_FENCE);
        clr511111.setType(Material.IRON_FENCE);
        clr5111111.setType(Material.IRON_FENCE);

        clr6.setType(Material.IRON_FENCE);
        clr60.setType(Material.IRON_FENCE);
        clr61.setType(Material.IRON_FENCE);
        clr611.setType(Material.IRON_FENCE);
        clr6111.setType(Material.IRON_FENCE);
        clr61111.setType(Material.IRON_FENCE);
        clr611111.setType(Material.IRON_FENCE);

        clr7.setType(Material.IRON_FENCE);
        clr70.setType(Material.IRON_FENCE);
        clr71.setType(Material.IRON_FENCE);
        clr711.setType(Material.IRON_FENCE);
        clr7111.setType(Material.IRON_FENCE);
        clr71111.setType(Material.IRON_FENCE);
        clr711111.setType(Material.IRON_FENCE);
      } else {
        clr1.setType(Material.AIR);
        clr10.setType(Material.AIR);
        clr11.setType(Material.AIR);
        clr111.setType(Material.AIR);
        clr1111.setType(Material.AIR);
        clr11111.setType(Material.AIR);
        clr111111.setType(Material.AIR);

        clr2.setType(Material.AIR);
        clr20.setType(Material.AIR);
        clr21.setType(Material.AIR);
        clr211.setType(Material.AIR);
        clr2111.setType(Material.AIR);
        clr21111.setType(Material.AIR);
        clr211111.setType(Material.AIR);

        clr3.setType(Material.AIR);
        clr30.setType(Material.AIR);
        clr31.setType(Material.AIR);
        clr311.setType(Material.AIR);
        clr3111.setType(Material.AIR);
        clr31111.setType(Material.AIR);
        clr311111.setType(Material.AIR);

        clr4.setType(Material.AIR);
        clr40.setType(Material.AIR);
        clr41.setType(Material.AIR);
        clr411.setType(Material.AIR);
        clr4111.setType(Material.AIR);
        clr41111.setType(Material.AIR);
        clr411111.setType(Material.AIR);

        int w = 1;
        while (w < 8) {
          Block clearer = set122.getRelative(BlockFace.DOWN, w);
          clearer.setType(Material.AIR);
          w++;
        }

        clr5.setType(Material.AIR);
        clr50.setType(Material.AIR);
        clr51.setType(Material.AIR);
        clr511.setType(Material.AIR);
        clr5111.setType(Material.AIR);
        clr51111.setType(Material.SMOOTH_BRICK);
        clr511111.setType(Material.AIR);
        clr5111111.setType(Material.SMOOTH_BRICK);

        clr6.setType(Material.WATER);
        clr60.setType(Material.WATER);
        clr61.setType(Material.WATER);
        clr611.setType(Material.WATER);
        clr6111.setType(Material.WATER);
        clr61111.setType(Material.WATER);
        clr611111.setType(Material.WATER);

        clr7.setType(Material.WATER);
        clr70.setType(Material.WATER);
        clr71.setType(Material.WATER);
        clr711.setType(Material.WATER);
        clr7111.setType(Material.WATER);
        clr71111.setType(Material.WATER);
        clr711111.setType(Material.WATER);
      }
      newx++;
      x++;
    }
    return a;
  }
}