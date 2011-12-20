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
		int olddir = 1;
		int rooms1 = rooms - 2;

		Block set1 = set.getRelative(bf3, 1);

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

		Block set10;
		Block set11;

		for (int roomcount = 2; roomcount <= rooms1; roomcount++) {

			if (roomcount != 2) {

				dir = nextdir(dir);
			}

			System.out.println(roomcount - 1);
			System.out.println(dir);

			if (dir == 0) {

				if (olddir == 2 || olddir == 3) {

					set10 = pos.getRelative(bf1, 2);

					int tun2 = tun.nstStraight(set10, m, bf1);

					pos = set10.getRelative(bf1, tun2 - 3);

					olddir = 0;
				}

				else {

					int tun2 = tun.nstStraight(pos, m, bf1);

					pos = pos.getRelative(bf1, tun2 - 3);

					olddir = 0;
				}
			}

			if (dir == 1) {

				if (olddir == 2 || olddir == 3) {

					set10 = pos.getRelative(bf2, 2);

					int tun3 = tun.nstStraight(set10, m, bf2);

					pos = set10.getRelative(bf2, tun3 - 3);

					olddir = 1;
				}

				else {

					int tun3 = tun.nstStraight(pos, m, bf2);

					pos = pos.getRelative(bf2, tun3 - 3);

					olddir = 1;
				}
			}

			if (dir == 2) {

				if (olddir == 0) {

					System.out.println(":D 0");

					set10 = pos.getRelative(bf3, 2);

					set11 = set10.getRelative(bf2, 1);

					int tun4 = tun.ewtStraight(set11, m, bf3);

					pos = set11.getRelative(bf3, tun4 - 4);

					olddir = 2;
				}

				if (olddir == 1) {

					System.out.println(":D 0");

					set10 = pos.getRelative(bf3, 2);

					set11 = set10.getRelative(bf1, 1);

					int tun4 = tun.ewtStraight(set11, m, bf3);

					pos = set11.getRelative(bf3, tun4 - 4);

					olddir = 2;
				}

				else {

					set10 = pos.getRelative(bf3, 2);

					int tun4 = tun.ewtStraight(set10, m, bf3);

					pos = set10.getRelative(bf3, tun4 - 4);

					olddir = 2;
				}
			}

			if (dir == 3) {

				if (olddir == 0) {

					set10 = pos.getRelative(bf4, 2);

					set11 = set10.getRelative(bf2, 1);

					int tun5 = tun.ewtStraight(set11, m, bf4);

					pos = set11.getRelative(bf4, tun5 - 4);

					olddir = 3;
				}

				if (olddir == 1) {

					set10 = pos.getRelative(bf4, 2);

					set11 = set10.getRelative(bf1, 1);

					int tun5 = tun.ewtStraight(set11, m, bf4);

					pos = set11.getRelative(bf4, tun5 - 4);

					olddir = 3;
				}

				else {

					set10 = pos.getRelative(bf4, 2);

					int tun5 = tun.ewtStraight(set10, m, bf4);

					pos = set10.getRelative(bf4, tun5 - 4);

					olddir = 3;
				}
			}
		}

	}

	int nextdir (int dir) {

		int ran = gen.nextInt(5);
		
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

				dir = 2;
			}

			if (ran == 4) {

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

				dir = 2;
			}

			if (ran == 4) {

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
		}

		return dir;

	}
}
