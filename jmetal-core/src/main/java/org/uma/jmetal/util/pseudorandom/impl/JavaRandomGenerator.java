//  This program is free software: you can redistribute it and/or modify
//  it under the terms of the GNU Lesser General Public License as published by
//  the Free Software Foundation, either version 3 of the License, or
//  (at your option) any later version.
//
//  This program is distributed in the hope that it will be useful,
//  but WITHOUT ANY WARRANTY; without even the implied warranty of
//  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//  GNU Lesser General Public License for more details.
//
//  You should have received a copy of the GNU Lesser General Public License
//  along with this program.  If not, see <http://www.gnu.org/licenses/>.

package org.uma.jmetal.util.pseudorandom.impl;

import org.uma.jmetal.util.pseudorandom.PseudoRandomGenerator;

import java.util.Random;

/**
 * @author Antonio J. Nebro
 * @version 0.1
 */
public class JavaRandomGenerator implements PseudoRandomGenerator {
  private Random rnd = new Random() ;

  @Override
  public int nextInt(int lowerBound, int upperBound) {
    return lowerBound + rnd.nextInt()*(upperBound - lowerBound) ;
  }

  @Override
  public double nextDouble(double lowerBound, double upperBound) {
    return lowerBound + rnd.nextDouble()*(upperBound - lowerBound) ;
  }

  @Override
  public long nextLong(long lowerBound, long upperBound) {
    return lowerBound + rnd.nextLong()*(upperBound - lowerBound);
  }

  @Override
  public float nextFloat(float lowerBound, float upperBound) {
    return lowerBound + rnd.nextFloat()*(upperBound - lowerBound) ;
  }

  @Override
  public byte[] nextBytes(int count) {
    byte[] bytes = new byte[count] ;
    rnd.nextBytes(bytes);
    return bytes ;
  }
}