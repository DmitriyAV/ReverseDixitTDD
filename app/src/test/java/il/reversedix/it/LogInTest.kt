package il.reversedix.it

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import il.reversedix.it.model.LogInModel
import il.reversedix.it.viewModel.LogInViewModel
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mockito.mock
import org.mockito.kotlin.mock


class LogInTest {
    @Rule
    @JvmField
    var rule = InstantTaskExecutorRule()

    private val viewModel = LogInViewModel()
    private val logInObserver : Observer<LogInModel> = mock()


    @Before
    fun setUp() {
        viewModel.logInModel.observeForever(logInObserver)
    }

    @Test
    fun `log in with valid credentials`() {
        viewModel.logIn("user")
        val logInModel = viewModel.logInModel.value
        assertEquals(logInModel?.success, true)
    }
}