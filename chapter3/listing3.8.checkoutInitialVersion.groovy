//Copyright 2012 Manning Publications Co.
//
//   Licensed under the Apache License, Version 2.0 (the "License");
//   you may not use this file except in compliance with the License.
//   You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
//   Unless required by applicable law or agreed to in writing, software
//   distributed under the License is distributed on an "AS IS" BASIS,
//   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//   See the License for the specific language governing permissions and
//   limitations under the License.
//
import org.apache.chemistry.opencmis.commons.*
import org.apache.chemistry.opencmis.commons.data.*
import org.apache.chemistry.opencmis.commons.enums.*
import org.apache.chemistry.opencmis.client.api.*

//<start id="checkoutInitialVersion"/> 
cmis = new scripts.CMIS(session)
 
def someDoc = session.
		getObjectByPath('/my first folder/potts_contract.docx')

def pwcId = someDoc.checkOut()//<co id="checkout" />

println("Is checked out?" + someDoc.versionSeriesCheckedOut)
println("PWC ID:" + pwcId)

cmis.download(pwcId,//<co id="downloadHelper" />             
	      '/users/jpotts/Desktop/potts_contract.docx')
//<end id="checkoutInitialVersion"/>
