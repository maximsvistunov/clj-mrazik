;
;  (C) Copyright 2017  Pavel Tisnovsky
;
;  All rights reserved. This program and the accompanying materials
;  are made available under the terms of the Eclipse Public License v1.0
;  which accompanies this distribution, and is available at
;  http://www.eclipse.org/legal/epl-v10.html
;
;  Contributors:
;      Pavel Tisnovsky
;

(ns clj-mrazik.irc-bot-test
  (:require [clojure.test          :refer :all]
            [clj-mrazik.irc-bot    :refer :all]
            [clj-mrazik.dyncfg     :as dyncfg]
            [clj-mrazik.dictionary :as dictionary]))

;
; Common functions used by tests.
;

(defn callable?
    "Test if given function-name is bound to the real function."
    [function-name]
    (clojure.test/function? function-name))

;
; Tests for various functions
;

(deftest test-load-data-file-existence
    "Check that the clj-mrazik.irc-bot/load-data-file definition exists."
    (testing "if the clj-mrazik.irc-bot/load-data-file definition exists."
        (is (callable? 'clj-mrazik.irc-bot/load-data-file))))


(deftest test-load-vocabulary-existence
    "Check that the clj-mrazik.irc-bot/load-vocabulary definition exists."
    (testing "if the clj-mrazik.irc-bot/load-vocabulary definition exists."
        (is (callable? 'clj-mrazik.irc-bot/load-vocabulary))))


(deftest test-message-to-channel?-existence
    "Check that the clj-mrazik.irc-bot/message-to-channel? definition exists."
    (testing "if the clj-mrazik.irc-bot/message-to-channel? definition exists."
        (is (callable? 'clj-mrazik.irc-bot/message-to-channel?))))


(deftest test-message-for-me?-existence
    "Check that the clj-mrazik.irc-bot/message-for-me? definition exists."
    (testing "if the clj-mrazik.irc-bot/message-for-me? definition exists."
        (is (callable? 'clj-mrazik.irc-bot/message-for-me?))))


(deftest test-create-reply-existence
    "Check that the clj-mrazik.irc-bot/create-reply definition exists."
    (testing "if the clj-mrazik.irc-bot/create-reply definition exists."
        (is (callable? 'clj-mrazik.irc-bot/create-reply))))


(deftest test-format-schedule-existence
    "Check that the clj-mrazik.irc-bot/format-schedule definition exists."
    (testing "if the clj-mrazik.irc-bot/format-schedule definition exists."
        (is (callable? 'clj-mrazik.irc-bot/format-schedule))))


(deftest test-random-message-existence
    "Check that the clj-mrazik.irc-bot/random-message definition exists."
    (testing "if the clj-mrazik.irc-bot/random-message definition exists."
        (is (callable? 'clj-mrazik.irc-bot/random-message))))


(deftest test-primefactors-existence
    "Check that the clj-mrazik.irc-bot/primefactors definition exists."
    (testing "if the clj-mrazik.irc-bot/primefactors definition exists."
        (is (callable? 'clj-mrazik.irc-bot/primefactors))))


(deftest test-factorial-existence
    "Check that the clj-mrazik.irc-bot/factorial definition exists."
    (testing "if the clj-mrazik.irc-bot/factorial definition exists."
        (is (callable? 'clj-mrazik.irc-bot/factorial))))


(deftest test-gcd-existence
    "Check that the clj-mrazik.irc-bot/gcd definition exists."
    (testing "if the clj-mrazik.irc-bot/gcd definition exists."
        (is (callable? 'clj-mrazik.irc-bot/gcd))))


(deftest test-print-factorial-existence
    "Check that the clj-mrazik.irc-bot/print-factorial definition exists."
    (testing "if the clj-mrazik.irc-bot/print-factorial definition exists."
        (is (callable? 'clj-mrazik.irc-bot/print-factorial))))


(deftest test-s-expression-existence
    "Check that the clj-mrazik.irc-bot/s-expression definition exists."
    (testing "if the clj-mrazik.irc-bot/s-expression definition exists."
        (is (callable? 'clj-mrazik.irc-bot/s-expression))))


(deftest test-is-s-expression?-existence
    "Check that the clj-mrazik.irc-bot/is-s-expression? definition exists."
    (testing "if the clj-mrazik.irc-bot/is-s-expression? definition exists."
        (is (callable? 'clj-mrazik.irc-bot/is-s-expression?))))


(deftest test-print-prime-factors-existence
    "Check that the clj-mrazik.irc-bot/print-prime-factors definition exists."
    (testing "if the clj-mrazik.irc-bot/print-prime-factors definition exists."
        (is (callable? 'clj-mrazik.irc-bot/print-prime-factors))))


(deftest test-print-gcd-existence
    "Check that the clj-mrazik.irc-bot/print-gcd definition exists."
    (testing "if the clj-mrazik.irc-bot/print-gcd definition exists."
        (is (callable? 'clj-mrazik.irc-bot/print-gcd))))


(deftest test-is-number?-existence
    "Check that the clj-mrazik.irc-bot/is-number? definition exists."
    (testing "if the clj-mrazik.irc-bot/is-number? definition exists."
        (is (callable? 'clj-mrazik.irc-bot/is-number?))))


(deftest test-is-two-numbers?-existence
    "Check that the clj-mrazik.irc-bot/is-two-numbers? definition exists."
    (testing "if the clj-mrazik.irc-bot/is-two-numbers? definition exists."
        (is (callable? 'clj-mrazik.irc-bot/is-two-numbers?))))


(deftest test-is-factorial?-existence
    "Check that the clj-mrazik.irc-bot/is-factorial? definition exists."
    (testing "if the clj-mrazik.irc-bot/is-factorial? definition exists."
        (is (callable? 'clj-mrazik.irc-bot/is-factorial?))))


(deftest test-is-word-from-dictionary?-existence
    "Check that the clj-mrazik.irc-bot/is-word-from-dictionary? definition exists."
    (testing "if the clj-mrazik.irc-bot/is-word-from-dictionary? definition exists."
        (is (callable? 'clj-mrazik.irc-bot/is-word-from-dictionary?))))


(deftest test-return-words-from-dictionary-existence
    "Check that the clj-mrazik.irc-bot/return-words-from-dictionary definition exists."
    (testing "if the clj-mrazik.irc-bot/return-words-from-dictionary definition exists."
        (is (callable? 'clj-mrazik.irc-bot/return-words-from-dictionary))))


(deftest test-prepare-reply-text-existence
    "Check that the clj-mrazik.irc-bot/prepare-reply-text definition exists."
    (testing "if the clj-mrazik.irc-bot/prepare-reply-text definition exists."
        (is (callable? 'clj-mrazik.irc-bot/prepare-reply-text))))


(deftest test-on-incoming-message-existence
    "Check that the clj-mrazik.irc-bot/on-incoming-message definition exists."
    (testing "if the clj-mrazik.irc-bot/on-incoming-message definition exists."
        (is (callable? 'clj-mrazik.irc-bot/on-incoming-message))))


(deftest test-send-message-existence
    "Check that the clj-mrazik.irc-bot/send-message definition exists."
    (testing "if the clj-mrazik.irc-bot/send-message definition exists."
        (is (callable? 'clj-mrazik.irc-bot/send-message))))


(deftest test-start-irc-bot-existence
    "Check that the clj-mrazik.irc-bot/start-irc-bot definition exists."
    (testing "if the clj-mrazik.irc-bot/start-irc-bot definition exists."
        (is (callable? 'clj-mrazik.irc-bot/start-irc-bot))))

;
; Tests for various functions
;

(deftest test-message-to-channel?
    "Check the behaviour of function clj-mrazik.irc-bot/message-to-channel?"
    (testing "the function message-to-channel?"
        (is (message-to-channel? {:target "#"}))
        (is (message-to-channel? {:target "#channel"}))
        (is (message-to-channel? {:target "#channel message"}))
        (is (not (message-to-channel? {:target ""})))
        (is (not (message-to-channel? {:target "channel"})))
        (is (not (message-to-channel? {:target "channel message"})))))

(deftest test-message-for-me?-1
    "Check the behaviour of function clj-mrazik.irc-bot/message-for-me?"
    (testing "the function message-for-me?"
        (are [name special-prefix message] (message-for-me? name special-prefix {:target message})
            "bot" "?" "bot:"
            "bot" "?" "bot: message")))

(deftest test-message-for-me?-2
    "Check the behaviour of function clj-mrazik.irc-bot/message-for-me?"
    (testing "the function message-for-me?"
        (are [name special-prefix message] (message-for-me? name special-prefix {:text message :target "channel"})
            "bot" "?" "bot:"
            "bot" "?" "bot: message"
            "bot" "?" "bot,"
            "bot" "?" "bot, message")))

(deftest test-message-for-me?-3
    "Check the behaviour of function clj-mrazik.irc-bot/message-for-me?"
    (testing "the function message-for-me?"
        (are [name special-prefix message] (message-for-me? name special-prefix {:text message :target "channel"})
            "bot" "?" "? message"
            "bot" "?" "?: message")))

(deftest test-message-for-me?-4
    "Check the behaviour of function clj-mrazik.irc-bot/message-for-me?"
    (testing "the function message-for-me?"
        (is (not (message-for-me? "bot" "?" {:text "?" :target ""})))
        (is (not (message-for-me? "bot" "?" {:text "" :target ""})))))

(deftest test-create-reply
    "Check the behaviour of function clj-mrazik.irc-bot/create-reply"
    (testing "the function create-reply"
        (are [x y] (= x (create-reply y))
            {:target "#"}                  {:target "#"}
            {:target "#channel"}           {:target "#channel"}
            {:target "#channel message"}   {:target "#channel message"}
            {:target "nick" :nick "nick"}  {:target "" :nick "nick"})))

(deftest test-use-wildchars?
    "Check the behaviour of function clj-mrazik.irc-bot/use-wildchars?"
    (testing "the function use-wildchars?"
        (are [x y] (= x (use-wildchars? y))
            true "*word"
            true "word*"
            true "*word*"
            true "*"
            false "word")))

(deftest test-is-word-from-dictionary?
    "Check the behaviour of function clj-dopey.irc-bot/is-word-from-dictionary?"
    (testing "the function is-word-from-dictionary?"
        (with-redefs [dictionary/word-exist? (fn [input] false)]
            (is (not (is-word-from-dictionary? "word"))))
        (with-redefs [dictionary/word-exist? (fn [input] true)]
            (is (is-word-from-dictionary? "word")))))

(def test-word
 {:description
  "For details, see the universal Glossary.",
  :use 1,
  :copyrighted 0,
  :source "The Glossary",
  :internal 0,
  :incorrect_forms "",
  :term "abend",
  :product nil,
  :class "adjective",
  :see_also "",
  :correct_forms "",
  :verified 1})

(deftest test-return-words-from-dictionary
    "Check the behaviour of function clj-dopey.irc-bot/return-words-from-dictionary"
    (testing "the function return-words-from-dictionary"
        (with-redefs [dictionary/find-word (fn [input] (dictionary/correct-forms test-word))]
            (is (= (return-words-from-dictionary "test") (dictionary/correct-forms test-word))))))

(deftest test-return-word-like-this
    "Check the behaviour of function clj-dopey.irc-bot/return-word-like-this"
    (testing "the function return-word-like-this"
        (with-redefs [dictionary/find-word-like-this (fn [input] input)]
            (is (= (return-word-like-this "test") "test")))))

(deftest test-return-more-words-like-this
    "Check the behaviour of function clj-dopey.irc-bot/return-more-words-like-this"
    (testing "the function return-more-words-like-this"
        (with-redefs [dictionary/find-words-like-this (fn [input] ["one" "two"])]
            (is (= (return-more-words-like-this "test") ["one" "two"])))))

(deftest test-one-word-like-this?
    "Check the behaviour of function clj-dopey.irc-bot/one-word-like-this?"
    (testing "the function one-word-like-this?"
        (with-redefs [dictionary/words-like-this (fn [input] 1)]
            (is (one-word-like-this? "test*"))
            (is (one-word-like-this? "*test"))
            (is (one-word-like-this? "*test*"))
            (is (one-word-like-this? "*")))
        (with-redefs [dictionary/words-like-this (fn [input] 42)]
            (is (not (one-word-like-this? "test*")))
            (is (not (one-word-like-this? "*test")))
            (is (not (one-word-like-this? "*test*")))
            (is (not (one-word-like-this? "*"))))
        (with-redefs [dictionary/words-like-this (fn [input] nil)]
            (is (not (one-word-like-this? "test"))) ; no wildchars
            (is (not (one-word-like-this? ""))) ; no wildchars
)))

(deftest test-more-words-like-this?
    "Check the behaviour of function clj-dopey.irc-bot/more-words-like-this?"
    (testing "the function more-words-like-this?"
        (with-redefs [dictionary/words-like-this (fn [input] 42)]
            (is (more-words-like-this? "test*"))
            (is (more-words-like-this? "*test"))
            (is (more-words-like-this? "*test*"))
            (is (more-words-like-this? "*")))
        (with-redefs [dictionary/words-like-this (fn [input] 1)]
            (is (not (more-words-like-this? "test*")))
            (is (not (more-words-like-this? "*test")))
            (is (not (more-words-like-this? "*test*")))
            (is (not (more-words-like-this? "*"))))
        (with-redefs [dictionary/words-like-this (fn [input] nil)]
            (is (not (more-words-like-this? "test"))) ; no wildchars
            (is (not (more-words-like-this? ""))) ; no wildchars
)))

(deftest test-dictionary-status
    "Check the behaviour of function clj-dopey.irc-bot/dictionary-status"
    (testing "the function dictionary-status"
        (with-redefs [dictionary/term-count (fn [] 42)]
            (is (= (dictionary-status) "Number of terms in dictionary: 42")))))

