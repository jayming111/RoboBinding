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

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import robobinding.beans.Function;
import robobinding.beans.PresentationModelAdapter;
import android.app.Activity;
import android.content.Context;

/**
 * @since 1.0
 * @version $Revision: 1.0 $
 * @author Robert Taylor
 *
 */
@RunWith(Theories.class)
@Ignore
public class CommandViewAttributeTest
{
//	@SuppressWarnings("unused")
//	private static class DummyPresentationModel
//	{
//		String methodInvoked;
//		public void w(){methodInvoked="w";}
//		public void x(){methodInvoked="x1";}
//		public void x(int arg1){methodInvoked="x2";}
//		public void y(int arg1, int arg2){methodInvoked="y";}
//		public void z(int arg1){methodInvoked="z1";}
//		public void z(int arg1, double arg2){methodInvoked="z2";}
//	}
//	
//	@DataPoints
//	public static RequestedToExpectedCommandMapping[] mappings = {
//		expectThat(requestedCommand("w"), withNoParameterTypes(), invokedsMethod("w")),
//		expectThat(requestedCommand("w"), withSingleIntegerArg(), invokedsMethod("w")),
//		expectThat(requestedCommand("x"), withNoParameterTypes(), invokedsMethod("x1")),
//		expectThat(requestedCommand("x"), withSingleIntegerArg(), invokedsMethod("x2")),
//		expectThat(requestedCommand("y"), withTwoIntegerArgs(), invokedsMethod("y")),
//		expectThat(requestedCommand("z"), withOneIntegerOneDoubleArg(), invokedsMethod("z2")),
//	};
//
//	@DataPoints
//	public static InvalidRequestedCommand[] invalidRequestedCommands = {
//		expectInvalid(requestedCommand("y"), withNoParameterTypes()),
//		expectInvalid(requestedCommand("y"), withSingleIntegerArg()),
//		expectInvalid(requestedCommand("z"), withNoParameterTypes()),
//		expectInvalid(requestedCommand("z"), withTwoIntegerArgs()),
//		expectInvalid(requestedCommand("abc"), withNoParameterTypes())
//	};
//	
//	
//	private DummyCommandViewAttribute commandViewAttribute;
//	private PresentationModelAdapter presentationModelAdapter;
//	private Context context = new Activity();
//	
//	@Theory
//	public void shouldGetCorrectCommandFromPresentationModel(RequestedToExpectedCommandMapping mapping)
//	{
//		newCommandViewAttributeWith(mapping.attributeValue, mapping.preferredParameterTypes);
//		
//		commandViewAttribute.bind(presentationModelAdapter, context);
//		
//		assertThat(commandViewAttribute.commandMethodName(), equalTo(mapping.expectedMethodInvoked));
//	}
//
//	@Theory
//	@Test (expected=RuntimeException.class)
//	public void whenBindingToAnInvalidCommandName_ShouldThrowARuntimeException(InvalidRequestedCommand requestedCommand)
//	{
//		newCommandViewAttributeWith(requestedCommand.attributeValue, requestedCommand.preferredParameterTypes);
//		commandViewAttribute.bind(presentationModelAdapter, context);
//	}
//	
//	private static class DummyCommandViewAttribute extends AbstractCommandViewAttribute
//	{
//		private Function command;
//		private final Class<?>[] preferredCommandParameterTypes;
//		
//		public DummyCommandViewAttribute(String attributeValue, Class<?>[] preferredCommandParameterTypes)
//		{
//			super(attributeValue);
//			this.preferredCommandParameterTypes = preferredCommandParameterTypes;
//		}
//
//		@Override
//		protected void bind(Function command)
//		{
//			this.command = command;
//		}
//
//		@Override
//		public Class<?>[] getPreferredCommandParameterTypes()
//		{
//			return preferredCommandParameterTypes;
//		}
//		
//		String commandMethodName()
//		{
//			return command.getMethod().getName();
//		}
//		
//		Class<?>[] commandParameterTypes()
//		{
//			return command.getMethod().getParameterTypes();
//		}
//	}
//	
//	private abstract static class RequestedCommand
//	{
//		String attributeValue;
//		Class<?>[] preferredParameterTypes;
//		public RequestedCommand(String attributeValue, Class<?>[] preferredParameterTypes)
//		{
//			this.attributeValue = attributeValue;
//			this.preferredParameterTypes = preferredParameterTypes;
//		}
//	}
//	
//	private static class RequestedToExpectedCommandMapping extends RequestedCommand
//	{
//		String expectedMethodInvoked;
//		
//		public RequestedToExpectedCommandMapping(String attributeValue, Class<?>[] preferredParameterTypes, String expectedMethodInvoked)
//		{
//			super(attributeValue, preferredParameterTypes);
//			this.expectedMethodInvoked = expectedMethodInvoked;
//		}
//	}
//	
//	private static class InvalidRequestedCommand extends RequestedCommand
//	{
//		public InvalidRequestedCommand(String attributeValue, Class<?>[] preferredParameterTypes)
//		{
//			super(attributeValue, preferredParameterTypes);
//		}
//	}
//	
//	private static String invokedsMethod(String commandName)
//	{
//		return commandName;
//	}
//
//	private static String requestedCommand(String commandName)
//	{
//		return commandName;
//	}
//
//	private static Class<?>[] withNoParameterTypes()
//	{
//		return new Class[0];
//	}
//
//	private static Class<?>[] withOneIntegerOneDoubleArg()
//	{
//		return new Class[]{int.class, double.class};
//	}
//
//	private static Class<?>[] withTwoIntegerArgs()
//	{
//		return new Class[]{int.class, int.class};
//	}
//
//	private static Class<?>[] withSingleIntegerArg()
//	{
//		return new Class[]{int.class};
//	}
//	
//	private static RequestedToExpectedCommandMapping expectThat(String attributeValue, Class<?>[] preferredParameterTypes, String expectedMethodInvoked)
//	{
//		return new RequestedToExpectedCommandMapping(attributeValue, preferredParameterTypes, expectedMethodInvoked);
//	}
//
//	private static InvalidRequestedCommand expectInvalid(String attributeValue, Class<?>[] preferredParameterTypes)
//	{
//		return new InvalidRequestedCommand(attributeValue, preferredParameterTypes);
//	}
//	
//	private void newCommandViewAttributeWith(String attributeValue, Class<?>[] preferredCommandParameterTypes)
//	{
//		commandViewAttribute = new DummyCommandViewAttribute(attributeValue, preferredCommandParameterTypes);
//	}
}