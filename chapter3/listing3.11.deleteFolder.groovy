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
import org.apache.chemistry.opencmis.client.api.*
//<start id="deleteFolder" />
import org.apache.chemistry.opencmis.commons.enums.*
import org.apache.chemistry.opencmis.
         commons.exceptions.CmisObjectNotFoundException;

def targetPath = "/my first folder"
def someFolder
try {
    someFolder = session.
        getObjectByPath(targetPath)
} catch (CmisObjectNotFoundException confe) {
    println("Could not find folder to delete: " + targetPath)    
    return
}
        
//someFolder.delete(true)//<co id="deleteFolder" />
someFolder.deleteTree(true, UnfileObject.DELETE, true)//<co id="deleteTree" />

println("Deleted folder")
//<end id="deleteFolder" />