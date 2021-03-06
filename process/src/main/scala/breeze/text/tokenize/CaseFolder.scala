/*
 Copyright 2009 David Hall, Daniel Ramage

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
*/
package breeze;
package text;
package tokenize;


/**
 * Lowercases all strings in a batch of strings.
 *
 * @author dramage
 */
case class CaseFolder() extends Transformer {
  override def apply(in : Iterable[String]) =
    in.map(CaseFolder);
}

object CaseFolder extends (String=>String)  {
  override def apply(in : String) : String = in.toLowerCase;
}
