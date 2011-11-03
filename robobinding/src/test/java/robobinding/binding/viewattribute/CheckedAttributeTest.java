/**
 * Copyright 2011 Cheng Wei, Robert Taylor
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 */
package robobinding.binding.viewattribute;

import org.junit.Before;
import org.junit.runner.RunWith;

import android.widget.CheckBox;

import com.xtremelabs.robolectric.RobolectricTestRunner;

/**
 *
 * @since 1.0
 * @version $Revision: 1.0 $
 * @author Robert Taylor
 */
@RunWith(RobolectricTestRunner.class)
public class CheckedAttributeTest extends AbstractSingleTypeTwoWayPropertyAttributeTest<Boolean>
{
	private CheckBox checkBox;
	
	@Before
	public void setUp()
	{
		checkBox = new CheckBox(null);
	}
	
	@Override
	protected void updateViewState(Boolean newValue)
	{
		checkBox.setChecked(newValue);
	}
	
	@Override
	protected Boolean getViewState()
	{
		return checkBox.isChecked();
	}
	
	@Override
	protected AbstractPropertyViewAttribute<Boolean> newAttributeInstance(String bindingAttributeValue)
	{
		return new CheckedAttribute(checkBox, bindingAttributeValue);
	}

	@Override
	protected void populateBindingExpectations(BindingSamples<Boolean> bindingExpectations)
	{
		bindingExpectations.add(true, false);
	}

}