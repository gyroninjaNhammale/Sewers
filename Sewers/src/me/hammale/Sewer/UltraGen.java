package me.hammale.Sewer;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;

public class UltraGen {

	Random gen = new Random();

	private final Tunnel tun = new Tunnel();
//	private final pit pit = new pit();
//	private final hut hut = new hut();
//	private final SinkHole sink = new SinkHole();
	private final manhole man = new manhole();
	private final entrance ent = new entrance();

	public void ugen (Block set, Material m, BlockFace bf, int rooms) {

		BlockFace bf1 = BlockFace.NORTH;
		BlockFace bf2 = BlockFace.SOUTH;
		BlockFace bf3 = BlockFace.EAST;
		BlockFace bf4 = BlockFace.WEST;
		BlockFace bf5 = BlockFace.UP;
		BlockFace bf6 = BlockFace.DOWN;

		int dir = 1;
		int rooms1 = rooms - 2;

		Block set1 = set.getRelative(BlockFace.EAST, 1);

		int man1 = man.man2(set1, m, bf2);
		
		Block set2 = set.getRelative(bf6, man1);
		Block set3 = set2.getRelative(bf1, 4);
		Block set4 = set3.getRelative(bf6, 3);
		
		
		int tun1 = tun.nstStraight(set4, m, bf2);

		Block set5 = set4.getRelative(bf2, 2);
		Block set6 = set5.getRelative(bf4, 3);
		Block set7 = set6.getRelative(bf5, 1);

		@SuppressWarnings("unused")
		int ent0 = ent.starter(set7, m, bf1);

		Block set8 = set7.getRelative(bf2, tun1 - 3);
		Block set9 = set8.getRelative(bf6, 1);
		Block pos = set9.getRelative(bf3, 3);

		for (int roomcount = 2; roomcount <= rooms1; roomcount++) {

			if (roomcount != 2) {

				dir = nextdir(dir);
			}

			System.out.println(roomcount);

			if (dir == 0) {

				int tun2 = tun.nstStraight(pos, m, bf1);

				set8 = set7.getRelative(bf1, tun2 - 3);
				set9 = set8.getRelative(bf6, 1);
				pos = set9.getRelative(bf4, 3);
			}

			if (dir == 1) {

				int tun3 = tun.nstStraight(pos, m, bf2);

				set8 = set7.getRelative(bf2, tun3 - 3);
				set9 = set8.getRelative(bf6, 1);
				pos = set9.getRelative(bf3, 3);
			}

			if (dir == 2) {

				int tun4 = tun.ewtStraight(pos, m, bf3);

				set8 = set7.getRelative(bf4, tun4 - 3);
				set9 = set8.getRelative(bf6, 1);
				pos = set9.getRelative(bf2, 3);
			}

			if (dir == 3) {

				int tun5 = tun.ewtStraight(pos, m, bf3);

				set8 = set7.getRelative(bf3, tun5 - 3);
				set9 = set8.getRelative(bf6, 1);
				pos = set9.getRelative(bf1, 3);
			}
		}

	}

	int nextdir (int dir) {

		int ran = gen.nextInt(8);
		
		if (dir == 0) {

			if (ran == 0) {

				dir = 0;
			}

			if (ran == 1) {

				dir = 0;
			}

			if (ran == 2) {

				dir = 0;
			}

			if (ran == 3) {

				dir = 0;
			}

			if (ran == 4) {

				dir = 0;
			}

			if (ran == 5) {

				dir = 0;
			}

			if (ran == 6) {

				dir = 0;
			}

			if (ran == 7) {

				dir = 2;
			}

			if (ran == 8) {

				dir = 3;
			}
		}

		if (dir == 1) {


			if (ran == 0) {

				dir = 1;
			}

			if (ran == 1) {

				dir = 1;
			}

			if (ran == 2) {

				dir = 1;
			}

			if (ran == 3) {

				dir = 1;
			}

			if (ran == 4) {

				dir = 1;
			}

			if (ran == 5) {

				dir = 1;
			}

			if (ran == 6) {

				dir = 1;
			}

			if (ran == 7) {

				dir = 2;
			}

			if (ran == 8) {

				dir = 3;
			}
		}

		if (dir == 2) {

			if (ran == 0) {

				dir = 0;
			}

			if (ran == 1) {

				dir = 1;
			}

			if (ran == 2) {

				dir = 2;
			}

			if (ran == 3) {

				dir = 2;
			}

			if (ran == 4) {

				dir = 2;
			}

			if (ran == 5) {

				dir = 2;
			}

			if (ran == 6) {

				dir = 2;
			}

			if (ran == 7) {

				dir = 2;
			}

			if (ran == 8) {

				dir = 2;
			}
		}

		if (dir == 3) {

			if (ran == 0) {

				dir = 0;
			}

			if (ran == 1) {

				dir = 1;
			}

			if (ran == 2) {

				dir = 3;
			}

			if (ran == 3) {

				dir = 3;
			}

			if (ran == 4) {

				dir = 3;
			}

			if (ran == 5) {

				dir = 3;
			}

			if (ran == 6) {

				dir = 3;
			}

			if (ran == 7) {

				dir = 3;
			}

			if (ran == 8) {

				dir = 3;
			}
		}

		return dir;

	}
}
