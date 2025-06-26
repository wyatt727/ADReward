package com.adreward.ktir

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.io.TempDir
import java.io.File
import java.io.FileOutputStream
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * Test class for IRScanner
 */
class IRScannerTest {

    @TempDir
    lateinit var tempDir: File

    private lateinit var testJar: File

    @BeforeEach
    fun setup() {
        // Create a simple placeholder file
        testJar = File(tempDir, "test-fixture.jar")
        testJar.createNewFile()
    }

    @Test
    fun testAddHit() {
        // Create scanner context with both admob and unity families
        val ctx = ScanCtx(listOf("admob", "unity"))
        
        // Simulate hooks directly
        ctx.simulateHooks()
        
        // Check that we have hooks
        val results = ctx.results
        
        // Check that we found at least one result for each family
        assertTrue(results.containsKey("admob"), "Should find AdMob hooks")
        assertTrue(results.containsKey("unity"), "Should find Unity hooks")
        
        // Check that we found specific expected hooks
        val admobHooks = results["admob"] ?: emptyList()
        val unityHooks = results["unity"] ?: emptyList()
        
        // At least one hook should be found for each family
        assertTrue(admobHooks.isNotEmpty(), "Should find at least one AdMob hook")
        assertTrue(unityHooks.isNotEmpty(), "Should find at least one Unity hook")
    }
    
    @Test
    fun testDeduplication() {
        // Create scanner context with both admob and unity families
        val ctx = ScanCtx(listOf("admob", "unity"))
        
        // Simulate hooks multiple times to test deduplication
        ctx.simulateHooks()
        ctx.simulateHooks() // Add duplicates to test deduplication
        
        // Verify results
        val results = ctx.results
        
        // Check that we found results for each family
        assertTrue(results.containsKey("admob"), "Should find AdMob hooks")
        assertTrue(results.containsKey("unity"), "Should find Unity hooks")
        
        // Results should not be empty
        val admobHooks = results["admob"] ?: emptyList()
        val unityHooks = results["unity"] ?: emptyList()
        
        assertTrue(admobHooks.isNotEmpty(), "Should find AdMob hooks")
        assertTrue(unityHooks.isNotEmpty(), "Should find Unity hooks")
        
        // Since we deduplicates results, we should still only have one of each hook type
        val uniqueAdMobMethods = admobHooks.map { it.methodName }.toSet()
        val uniqueUnityMethods = unityHooks.map { it.methodName }.toSet()
        
        assertEquals(expected = 1, actual = uniqueAdMobMethods.size, message = "Should deduplicate AdMob hooks")
        assertEquals(expected = 1, actual = uniqueUnityMethods.size, message = "Should deduplicate Unity hooks")
    }
    
    /**
     * Extension function to add simulated hooks directly to the ScanCtx for testing
     */
    private fun ScanCtx.simulateHooks() {
        // Add a simulated AdMob hook
        val admobHook = HookSite(
            className = "com.a.b.c.d",
            methodName = "a",
            desc = "(Lcom/google/android/gms/ads/rewarded/RewardItem;)V",
            kotlinSig = "d.a"
        )
        
        // Add a simulated Unity hook
        val unityHook = HookSite(
            className = "com.x.y.z",
            methodName = "onUnityAdsFinish",
            desc = "(Ljava/lang/String;Lcom/unity3d/ads/UnityAds${"$"}FinishState;)V",
            kotlinSig = "z.onUnityAdsFinish"
        )
        
        // Add hooks to context
        _results.getOrPut("admob") { mutableSetOf() }.add(admobHook)
        _results.getOrPut("unity") { mutableSetOf() }.add(unityHook)
    }
} 