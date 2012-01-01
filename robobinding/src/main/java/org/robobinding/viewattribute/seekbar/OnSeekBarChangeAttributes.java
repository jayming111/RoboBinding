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
package org.robobinding.viewattribute.seekbar;

import java.util.List;

import org.robobinding.internal.com_google_common.collect.Lists;
import org.robobinding.presentationmodel.PresentationModelAdapter;
import org.robobinding.viewattribute.AbstractGroupedPropertyViewAttribute;
import org.robobinding.viewattribute.ViewAttribute;

import android.content.Context;
import android.widget.SeekBar;

/**
 *
 * @since 1.0
 * @version $Revision: 1.0 $
 * @author Robert Taylor
 */
public class OnSeekBarChangeAttributes extends AbstractGroupedPropertyViewAttribute<SeekBar>
{
	public static final String ON_SEEK_BAR_CHANGE = "onSeekBarChange";
	public static final String PROGRESS = "progress";
	
	private List<ViewAttribute> viewAttributes;
	
	@Override
	public void bind(PresentationModelAdapter presentationModelAdapter, Context context)
	{
		for (ViewAttribute viewAttribute : viewAttributes)
			viewAttribute.bind(presentationModelAdapter, context);
	}

	@Override
	protected void initializeChildViewAttributes()
	{
		viewAttributes = Lists.newArrayList();
		
		OnSeekBarChangeListeners onSeekBarChangeListeners = new OnSeekBarChangeListeners();
		
		if (groupedPropertyAttribute.hasAttribute(PROGRESS))
			viewAttributes.add(new TwoWayProgressAttribute(onSeekBarChangeListeners));
		if (groupedPropertyAttribute.hasAttribute(ON_SEEK_BAR_CHANGE))
			viewAttributes.add(new OnSeekBarChangeAttribute(onSeekBarChangeListeners));
		
	}

}
