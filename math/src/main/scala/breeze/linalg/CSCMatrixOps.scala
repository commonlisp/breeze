package breeze.linalg
/*
 Copyright 2012 David Hall

 Licensed under the Apache License, Version 2.0 (the "License")
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
*/
import java.util._
import breeze.linalg.operators._
import breeze.linalg.support._
import breeze.numerics._

/** This is an auto-generated trait providing operators for CSCMatrix */
trait CSCMatrixOps_Double { this: CSCMatrix.type =>

   class canMulM_V_Double private[linalg] () extends BinaryOp[CSCMatrix[Double], Vector[Double], breeze.linalg.operators.OpMulMatrix, Vector[Double]] {
    def apply(a: CSCMatrix[Double], b: Vector[Double]) = {
      
      val res = DenseVector.zeros[Double](a.rows)
      var c = 0
      while(c < a.cols) {
        var rr = a.colPtrs(c)
        val rrlast = a.colPtrs(c+1)
        while (rr < rrlast) {
          val r = a.rowIndices(rr)
          res(r) += a.data(rr) * b(c)
          rr += 1
        }
        c += 1
      }

      res                                                               
    }
  }; implicit val canMulM_V_Double = new canMulM_V_Double ()

}

/** This is an auto-generated trait providing operators for CSCMatrix */
trait CSCMatrixOps_Float { this: CSCMatrix.type =>

   class canMulM_V_Float private[linalg] () extends BinaryOp[CSCMatrix[Float], Vector[Float], breeze.linalg.operators.OpMulMatrix, Vector[Float]] {
    def apply(a: CSCMatrix[Float], b: Vector[Float]) = {
      
      val res = DenseVector.zeros[Float](a.rows)
      var c = 0
      while(c < a.cols) {
        var rr = a.colPtrs(c)
        val rrlast = a.colPtrs(c+1)
        while (rr < rrlast) {
          val r = a.rowIndices(rr)
          res(r) += a.data(rr) * b(c)
          rr += 1
        }
        c += 1
      }

      res                                                               
    }
  }; implicit val canMulM_V_Float = new canMulM_V_Float ()

}

/** This is an auto-generated trait providing operators for CSCMatrix */
trait CSCMatrixOps_Int { this: CSCMatrix.type =>

   class canMulM_V_Int private[linalg] () extends BinaryOp[CSCMatrix[Int], Vector[Int], breeze.linalg.operators.OpMulMatrix, Vector[Int]] {
    def apply(a: CSCMatrix[Int], b: Vector[Int]) = {
      
      val res = DenseVector.zeros[Int](a.rows)
      var c = 0
      while(c < a.cols) {
        var rr = a.colPtrs(c)
        val rrlast = a.colPtrs(c+1)
        while (rr < rrlast) {
          val r = a.rowIndices(rr)
          res(r) += a.data(rr) * b(c)
          rr += 1
        }
        c += 1
      }

      res                                                               
    }
  }; implicit val canMulM_V_Int = new canMulM_V_Int ()

}
